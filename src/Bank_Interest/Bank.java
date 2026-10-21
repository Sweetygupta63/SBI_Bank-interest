package Bank_Interest;

public class Bank {
	String BankName;
	String Branch;
	String ifscCode;
	Bank(String BankName,String Branch,String ifscCode){
   	      this.BankName=BankName;
   	      this.Branch=Branch;
   	      this.ifscCode=ifscCode;
	}
	
	public void calculateInterest(int amount,int t)
	{
		if(amount<5000000)
			System.out.println("interest will be 2% monthly");
		else
			System.out.println("need to be paid monthly at 1.5% interest");
	}
	
	void deposite() {
		System.out.println("Money deposited");
	}
	void withdraw() {
		System.out.println("Money withdraw");
	}
     void displayBankDetails() {
    	 System.out.println("Bank Name: "+BankName);
    	 System.out.println("Bank Branch: "+Branch);
    	 System.out.println("Bank IFSCCODE: "+ifscCode);
     }
}
