class InstagramRunner{

  public static void main (String [] socilamedia ){
  
             boolean isCreated = Instagram.createAccount("Chiru0417", "Chiranjeevi", "chiru@gmail.com", "chiru0417");
			  System.out.println("user is Created" + isCreated);
      Instagram.getAccountInfo();
  }
 
}