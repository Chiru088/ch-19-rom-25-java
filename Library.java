class Library {
   String libraryName;
   String libraryAddress;
   

      Shelf shelf;
	  
   void getLibraryDetails(){
   System.out.println("the library Name is : " + libraryName);
   System.out.println("the library Address is : " +  libraryAddress);
   this.shelf.getShelfDetails();
   }	  

}