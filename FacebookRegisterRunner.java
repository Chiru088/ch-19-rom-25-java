class FacebookRegisterRunner{
   public static void main (String [] socialmedia){
      boolean isUserRegisterd=FacebookRegister.registerUser("Chiranjeevi","swamy",7852112223l,"chiru@gmail.com",22);
      System.out.println("is user registered :"+ isUserRegisterd);
   
   
   FacebookRegister.getUserInfo();
   }
   

}