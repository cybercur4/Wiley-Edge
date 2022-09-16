package Questions;



class Address{
	String add[];
	int flatNo;
	String flatName;
	String roadName;
	String cityName;
	Address(String add[]){
		this.add=add;
	}
	String details(int i) {
		String adr[]=add[i].split(",");
		flatNo=Integer.parseInt(adr[0]);
		flatName=adr[1];
		roadName=adr[2];
		cityName=adr[3];
		return "Flat No: "+flatNo+"\nFlat Name: "+flatName+"\nRoad Name: "+roadName+"\nCity Name: "+cityName;
	}
	
}
class Employee{
	int empId;
	String empName;
	String add[];
	Employee(int empId,String empName,String...add){
		this.empId=empId;
		this.empName=empName;
		this.add=add;
	}
	@Override
	public String toString() {
		Address address=new Address(add);
		return "Employee ID: " + empId + "\nEmployee Name: " + empName + "\n\nTEMPORARY ADDRESS DETAILS\n\n"+address.details(0)+"\n\nPERMANENT ADDRESS DETAILS\n\n"+address.details(1);
	}
	
	
}

public class Question8 {
	public static void main(String args[]) {
		Employee employee1=new Employee(1,"Shahzeb Khan","1008,Shantivilla Apartments,MG Road,Allahabad","64,Johnstonganj,Norullah Road,Allahabad");
		System.out.println(employee1);
	}
}
