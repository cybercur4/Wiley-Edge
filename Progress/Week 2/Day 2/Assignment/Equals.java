class Equals{
	String arr[];
	Equals(String... arr){
		this.arr=arr;
	}
	String check() {
		if(arr.length>=5 && arr[0]==arr[arr.length-1])
			return "First and Last Element are Equal";
		else
			return "Invalid Input";
	}
}

public class Question4 {
	public static void main(String args[]) {
		Equals equals1=new Equals("ab","bc","ok","hmm","ab");
		System.out.println(equals1.check());
		
	}
}
