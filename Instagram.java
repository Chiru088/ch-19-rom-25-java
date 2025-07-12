class Instagram{
  static String userName;
  static String fullName;
  static String eMail;
  static String password;
  
  public static boolean createAccount(String uName, String fName, String uMail, String pwd){
                boolean userNameValid = false;
                boolean fullNameValid = false;
				boolean eMailValid = false;
				boolean passwordValid = false;
                boolean isCreated = false;
  
  if ( uName != null){
     userName = uName;
	 userNameValid = true;
  }
  if ( fName != null){
	  fullName = fName;
	  fullNameValid = true;
  }
  if(uMail != null){
	 eMail = uMail;
	 eMailValid = true;
  }
  if(pwd != null){
	  password = pwd;
	  passwordValid = true;
  }
  
  
  if(userNameValid && fullNameValid && eMailValid && passwordValid ){
	  isCreated=true;
  }
   return isCreated;
  }

    public static void getAccountInfo(){
	System.out.println("the user Name is " + userName);
	System.out.println("the fullName is " + fullName);
	System.out.println("the user eMail is " + eMail);
	System.out.println("the user password is " + password);
	
	}
    


}