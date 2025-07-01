class Bar {
	
	/*static String alcohol1 = "Whiskey";
	static String alcohol2 = "Vodka";
	static String alcohol3 = "Rum";
	static String alcohol4 = "Gin";
	static String alcohol5 = "Tequila";
	static String alcohol6 = "Brandy";
	static String alcohol7 = "Wine";
	static String alcohol8 = "Beer";
	static String alcohol9 = "Scotch";
	static String alcohol10 = "Cognac";
	static String alcohol11 = "Absinthe";
	static String alcohol12 = "Champagne";*/
	
    public static void main(String[] args) {
		
		String alcohol1 = "Whiskey";
        String alcohol2 = "Vodka";
        String alcohol3 = "Rum";
        String alcohol4 = "Gin";
        String alcohol5 = "Tequila";
        String alcohol6 = "Brandy";
        String alcohol7 = "Wine";
        String alcohol8 = "Beer";
        String alcohol9 = "Scotch";
        String alcohol10 = "Cognac";
        String alcohol11 = "Absinthe";
        String alcohol12 = "Champagne";

        String alcoholNames[] =  {
			alcohol1, alcohol2, alcohol3, alcohol4, alcohol5, alcohol6,
			alcohol7, alcohol8, alcohol9, alcohol10, alcohol11, alcohol12
		};
     
        /*System.out.println("In Bar, the available alcohols are:");
        System.out.println(alcoholNames[0] + ", " + alcoholNames[1] + ", " + alcoholNames[2] + ", " + alcoholNames[3] + ", " +
                           alcoholNames[4] + ", " + alcoholNames[5] + ", " + alcoholNames[6] + ", " + alcoholNames[7] + ", " +
                           alcoholNames[8] + ", " + alcoholNames[9] + ", " + alcoholNames[10] + ", " + alcoholNames[11]);*/
						   
						    for (String alcoholName: alcoholNames){
								System.out.println(alcoholName);
								
							}
    }
}
