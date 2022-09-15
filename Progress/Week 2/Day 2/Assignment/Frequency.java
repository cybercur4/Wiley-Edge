package Questions;

import java.util.Arrays;

class Frequency{
	String str;
	Frequency(String str){
		this.str=str;
	}
	String calculate(){
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String st="";
		char prev=' ';
		int count=1;
		int flag=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
					count++;
				else
					if(ch[i]==prev)
						flag=1;
					break;
			}
			if(flag==0)
			st+=Character.toString(ch[i])+": "+count+" \n";
			count=1;
			prev=ch[i];
			flag=0;
		}
		System.out.println("----------------------------------------");
		return st;
	}
	
}

public class Question3 {
	public static void main(String args[]) {
		Frequency frequency1=new Frequency("Happy");
		System.out.println(frequency1.calculate());
		Frequency frequency2=new Frequency("armadillo");
		System.out.println(frequency2.calculate());
		Frequency frequency3=new Frequency("Tortoise");
		System.out.println(frequency3.calculate());
	}
}
