package Questions;

enum AccountType{
	SAVINGS(4),
	CURRENT(5),
	INVALID(0);
	private int rate;
	private AccountType(int rate) {
		this.rate=rate;
	}
	public int getrate() {
		return this.rate;
	}
	
}

class DepositAmountException extends Exception{
	
}
class BankAccount{
	int accountid;
	String name;
	int type;
	BankAccount(int accountid,String name,int type){
		this.accountid=accountid;
		this.name=name;
		this.type=type;
	}
	double calculateTotalInterest(double amount,double years) throws DepositAmountException {
		if(amount<1)
			throw new DepositAmountException();
		AccountType a1=AccountType.INVALID;
		switch(type) {
		case 1:
			a1= AccountType.SAVINGS;
			break;
		case 2:
			a1=AccountType.CURRENT;
			break;
		default:
			System.err.println("INVALID ACCOUNT TYPE");
		}
		return (amount*a1.getrate()*years)/100;
	}
	
}

public class Question6 {
	public static void main(String args[]) throws DepositAmountException {
		BankAccount account1=new BankAccount(1,"Shahzeb",1);
		System.out.println("TOTAL INTEREST= "+account1.calculateTotalInterest(12000, 2));
		BankAccount account2=new BankAccount(2,"Akash",2);
		System.out.println("TOTAL INTEREST= "+account2.calculateTotalInterest(12000, 2));
		BankAccount account3=new BankAccount(1,"Shahzeb",3);
		System.out.println("TOTAL INTEREST= "+account3.calculateTotalInterest(-1, 2));
	}
}
