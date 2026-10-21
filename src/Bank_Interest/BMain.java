package Bank_Interest;

public class BMain {
      public static void main(String[] args) {
		SBI s=new SBI("Savings",7.6);
	     s.deposite();
	     s.calculateInterest();
	     s.displayBankDetails();
	     s.withdraw();
	     s.openAccount();
	    
	}
}
