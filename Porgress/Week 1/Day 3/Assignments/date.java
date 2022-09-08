/*Create a class Date with following details:
Attributes: dd,mm,yyyy.
Methods: displayDate(),checkDate().
 
(Use the concept of parameterized constructor, code recommendation and 'this' keyword) */


class Date{
	int dd;
	int mm;
	int yyyy;
	Date(int dd,int mm,int yyyy){
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	void displayDate() {
		if(checkDate()==1) {
			String month="";
			switch(mm) {
			case 1:
				month="January";
				break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			break;
		case 12:
			month="December";
			break;
		}
			System.out.println(dd+" "+month+" "+yyyy);
		}
		else
			System.out.println("INVALID DATE");
	}
	int checkDate() {
		if(mm==0 || mm>12 || dd==0 || dd>31)
			return 0;
		else if((mm<=7 && mm%2==0 && dd>30) || (mm>7 && mm%2==1 && dd>30))
			return 0;
		else if((yyyy%4!=0 && dd>28) || (yyyy%4==0 && dd>29))
			return 0;
		else 
			return 1;
	}
}
public class Question2 {
	public static void main(String args[]) {
		Date date1=new Date(07,12,1999);
		date1.displayDate();
		Date date2=new Date(14,6,1974);
		date2.displayDate();
		Date date3=new Date(29,2,2019);
		date3.displayDate();
	}
}
