class PassportRegisterRunner{

  public static void main (String [] seva){

   boolean userIsRegistered = PassportRegister.registerUser("chiranjeevi","Swamy","Chiru","Chiru","06-Sep-2003","chiru@gmail.com");//arguments
   System.out.println("Is user Registered " +userIsRegistered);



    PassportRegister.getUserInfo();
}

}