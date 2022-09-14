class Email{
	String email;
	Email(String email){
		this.email=email;
	}
	String validate() {
		int flag=0;
		if(email.substring(email.length()-3,email.length()).equals("com") && Character.isLetter(email.charAt(0))) {
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@')
				flag++;
		}
		if(flag==1)
			return "Valid Email";
		}
		return "Invalid Email";
	}
}

public class Question2 {
	public static void main(String args[]) {
		Email email1=new Email("coolrazor26@gmail.com");
		System.out.println(email1.validate());
		Email email2=new Email("24the@gmail.com");
		System.out.println(email2.validate());
		Email email3=new Email("shahzebkhangmail.com");
		System.out.println(email3.validate());
		Email email4=new Email("the@happy@gmail.com");
		System.out.println(email4.validate());
		Email email5=new Email("shahzebkhan@gmail.co");
		System.out.println(email5.validate());
	}
}
