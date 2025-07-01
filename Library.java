class Library {
	/*static String book1 = "Wings of Fire";
	static String book2 = "The Alchemist";
	static String book3 = "1984";
	static String book4 = "To Kill a Mockingbird";
	static String book5 = "The Monk Who Sold His Ferrari";
	static String book6 = "Harry Potter";
	static String book7 = "Rich Dad Poor Dad";
	static String book8 = "The Secret";*/
    public static void main(String[] args) {
		
	
        String book1 = "Wings of Fire";
        String book2 = "The Alchemist";
        String book3 = "1984";
        String book4 = "To Kill a Mockingbird";
        String book5 = "The Monk Who Sold His Ferrari";
        String book6 = "Harry Potter";
        String book7 = "Rich Dad Poor Dad";
        String book8 = "The Secret"; 
		
		bookNames[] = {
			book1, book2, book3, book4,
			book5, book6, book7, book8
		};

        /*System.out.println("In Library, the books are:");
        System.out.println(bookNames[0] + ", " + bookNames[1] + ", " + bookNames[2] + ", " + bookNames[3] + ", " +
                           bookNames[4] + ", " + bookNames[5] + ", " + bookNames[6] + ", " + bookNames[7]);*/
						   
						   
						   
						  for (String bookName : bookNames){
							  System.out.println(bookName);
						  }
    }
}
