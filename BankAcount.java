class BankAcount{
    static double balance;
	
	public static void main (String money []){
		
	    System.out.println("main stared");
		// method();
		credit(1000.00);
		System.out.println("The avaliable balance is "+ balance);
		
		
		
		
		
		
		System.out.println("main ended");
	}
	
	
	
	
	
	
	public static void debit(double amount){
		System.out.println("Debit started");
		balance = balance - amount;
		System.out.println("Debit ended");
	}
	
	public static void credit(double amount){
		System.out.println("credit started");
		balance = balance + amount;
		System.out.println("credit ended");
	}
	
	
}










// method name is always associatet with parenthesis inside the parametere