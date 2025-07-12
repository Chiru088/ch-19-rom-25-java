class PassportRegister{
    static String givenName;
	static String surName;
	static String password;
	static String confirmPassword;
	static String dob;
	static String eMail;
	// method are the one which come up with the functionality
	
  public static boolean registerUser(String gName,String sName, String pwd, String cPwd, String udob, String ueMail ){
                 boolean  isUserRegisterd = false;
				 boolean  givenNameValid = false;
				 boolean surNameValid = false;
                 boolean passwordValid = false;
				 boolean confirmPasswordValid = false;
                 boolean dobValid = false;
				 boolean eMailValid = false;
	// vlaidation  
	 if (gName != null){
	    givenName = gName;
		givenNameValid = true;
	 }
	 
	 if(sName != null){
		 surName = sName;
		 surNameValid = true;
	 }
	 
	 if( pwd != null){
		    password = pwd;
			passwordValid = true;
	 }
	 else{
		System.out.println("the given password is incorrect"); 
	 }
	 if(cPwd != null && pwd != null && cPwd.equals(pwd)){
		 confirmPassword = cPwd;
		 confirmPasswordValid = true; 
	 }
	 else{
		System.out.println("the given password is incorrect"); 
	 }
	 if( udob != null){
		dob = udob;
		dobValid = true;
		 
	 }
	 if( ueMail != null){
		 eMail = ueMail;
		 eMailValid = true;
		 
	 }

	 if(givenNameValid && surNameValid && passwordValid && confirmPasswordValid && dobValid && eMailValid){
		 isUserRegisterd = true;
	 }
	 
	 
	 return isUserRegisterd;
  
  }
  
  
  public static void getUserInfo(){
	  System.out.println("The given Name is " + givenName);
	  System.out.println("The sur Name is " + surName);
	  System.out.println("The password is " + password);
	  System.out.println("The confirm Password is " + confirmPassword);
	  System.out.println("The DOb of user is " + dob);
	  System.out.println("The user email is " + eMail);
  }



}