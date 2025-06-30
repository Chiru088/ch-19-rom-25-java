class Bar {
    public static void main(String[] args) {
        String alcoholNames[] = {
            "Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Brandy",
            "Wine", "Beer", "Scotch", "Cognac", "Absinthe", "Champagne"
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
