package Bank_Interest;

public class SBI extends Bank{
	    String accountType;
	    double interestRate;
	   
	    SBI(String accounType,double interestRate){
	    	super("RBI","New Delhi","RBI005");
	    	this.accountType=accounType;
	    	this.interestRate=interestRate;		
	    }
	    
	    @Override
	    public void calculateInterest(int amount,int t)
	    {
	       System.out.println("intest rate is fixed for all users");
	       double r = amount*8*t/100.0;
	       System.out.println("Interest will be "+r);
	    }
	    
	    void openAccount() {
	    	System.out.println("SBI Account opened");
	    }
	    void calculateInterest() {
	    	System.out.println("SBI Interest Rate: "+interestRate);	    	
		}
}
