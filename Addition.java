class Addition{
	
	public static void main (String [] adding){
		// methods are reperent the purpose of the class 
		
		add (125, 125);
		add (478, 458);
		add  (1,2);
		
		
	}
	
	public static void add (int num1 , int num2){
		int add = num1 + num2 ;
		int sub = num1 - num2;
		int mod = num1 / num2;
		int mul = num1 * num2;
		int per = num1 % num2;
	
		System.out.println("addition:"+ add);
			System.out.println("subraction:"+ sub);
			System.out.println("modules:"+ mod);
			System.out.println("multiplication:"+ mul);
			System.out.println("percentage:"+ per);
			
				
	}
	
	
}