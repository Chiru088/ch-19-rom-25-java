class Shelf{

    String capcity;
	String material;

    Books  books;
	  
	  
	  void getShelfDetails(){
	  System.out.println("the shelf capcity is : " + capcity);
	  System.out.println("the shelf material is : " + material);
	  
	  this.books.getBookDetails();
	  }
	  
	
	


}