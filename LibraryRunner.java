class LibraryRunner{

public static void main (String stans []){

              Books books = new Books();
			     String bookTitle = "Spectrum publication";
   String bookAuthor="Arivind Singh";
     books.bookTitle=bookTitle;
	 books.bookAuthor=bookAuthor;
	 
	 
	         Shelf shelf = new Shelf();
			 shelf.books=books;
	         String capcity="100 Books";
	String material="metal";
	shelf.capcity=capcity;
	shelf.material=material;
	
	        Library library = new Library();
			library.shelf=shelf;
           String libraryName="Government Library";
   String libraryAddress="Rajajnagar";
   library.libraryName=libraryName;
   library.libraryAddress=libraryAddress;
			  

  library.getLibraryDetails();
}




}