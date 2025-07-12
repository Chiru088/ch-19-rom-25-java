class FacebookRegister{

   static String firstName;
   static String lastName;
   static long phoneNumber;
   static String userMail;
   static int userAge;
   
   public static boolean registerUser(String fName, String lName, long pName, String uMail, int uAge){
                boolean firstNameValid = false;
				boolean lastNameValid = false;
				boolean phoneNumberValid = false;
				boolean userMailValid = false;
				boolean userAgeValid = false;
				boolean  isUserRegisterd = false;
    if(fName != null){
	  firstName = fName;us
	  firstNameValid = true;
	}
   if(lName != null){
	   lastName = lName;
	   lastNameValid = true; 
   }
   if(pName > 0){
	   phoneNumber = pName;
	   phoneNumberValid = true;
	  //if(phoneNumber != null && phoneNumber.length() == 10 ) 
   }
   
   if(uMail != null){
	   userMail = uMail;
	   userMailValid = true;
	   
   }
   if(uAge > 0){
	   userAge = uAge;
	   userAgeValid = true;
	   
   }
   if(firstNameValid == true && lastNameValid == true && phoneNumberValid == true && userMailValid == true && userAgeValid == true){
	   isUserRegisterd = true;
	   
   }
   
   return isUserRegisterd;


}
  
public static void getUserInfo(){
	  System.out.println("The first Name is " + firstName);
	  System.out.println("The last Name is " + lastName);
	  System.out.println("The phone Number is " + phoneNumber);
	  System.out.println("The user Mail is " + userMail);
	  System.out.println("The user age is " + userAge);
	  
  }


  

}