class RevStr{
	String st;
	RevStr(String st){
		this.st=st;
	}
	String reverseString() {
		String s="";
		for(int i=st.length()-1;i>=0;i--) {
			s+=st.charAt(i);
		}
		return s;
	}
}

public class Question1 {
	public static void main(String args[]) {
		RevStr rev1=new RevStr("HELLO");
		System.out.println(rev1.reverseString());
		RevStr rev2=new RevStr("HOW");
		System.out.println(rev2.reverseString());
		RevStr rev3=new RevStr("ARE");
		System.out.println(rev3.reverseString());
		RevStr rev4=new RevStr("YOU");
		System.out.println(rev4.reverseString());
	}
}
