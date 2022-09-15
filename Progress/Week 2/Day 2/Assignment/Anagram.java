class Anagram{
	String s1;
	String s2;
	Anagram(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	String check() {
		if(s1.length()!=s2.length())
			return "Not Anagram";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i])
				return "Not Anagram";
		}
		return "Anagram";
		
	}
}

public class Question5 {
	public static void main(String args[]) {
		Anagram anagram1=new Anagram("LISTEN", "SILENT");
		System.out.println(anagram1.check());
		Anagram anagram2=new Anagram("LISTEK", "SILENT");
		System.out.println(anagram2.check());
	}
}
