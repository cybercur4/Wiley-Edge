package main;

public class Helloworld {
	public int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	public String switchh(int n) {
		switch(n) {
		case 1:
			return "one";
		
		case 2:
			return "two";
		default:
			return "Wrong";
		}
		}
	public int sum(int n) {
		int sume=0;
		while(n!=0) {
			sume+=n;
			n--;
		}
		return sume;
	}
	public int forl(int n) {
		int sume=0;
		for(int i=0;i<n;i++) {
		if(i==1)
			continue;
		else if(i==n-2)
			break;
		else
			sume+=i;
		}
		return sume;
	}
	
	public static void main(String args[]) {
	Helloworld hw=new Helloworld();
	System.out.println(hw.max(2,3));
	System.out.println(hw.switchh(1));
	System.out.println(hw.sum(5));
	System.out.println(hw.forl(5));
	}
	}
