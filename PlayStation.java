class PlayStation {
	
	
	/*static String game1 = "God of War";
	static String game2 = "Spider-Man";
	static String game3 = "Horizon Zero Dawn";
	static String game4 = "Uncharted 4";
	static String game5 = "Gran Turismo";
	static String game6 = "FIFA 23";
	static String game7 = "The Last of Us";
	static String game8 = "Ghost of Tsushima";
	static String game9 = "Ratchet & Clank";
	static String game10 = "Bloodborne";*/
	
   public static void main(String[] args) {
		System.out.println("In PlayStation, the available games are:");
		
		
		String game1 = "God of War";
        String game2 = "Spider-Man";
        String game3 = "Horizon Zero Dawn";
        String game4 = "Uncharted 4";
        String game5 = "Gran Turismo";
        String game6 = "FIFA 23";
        String game7 = "The Last of Us";
        String game8 = "Ghost of Tsushima";
        String game9 = "Ratchet & Clank";
        String game10 = "Bloodborne";

		String games[] = {
			game1, game2, game3, game4, game5,
			game6, game7, game8, game9, game10
		}; 

       /* System.out.println("In PlayStation, the available games are:");
        System.out.println(games[0] + ", " + games[1] + ", " + games[2] + ", " + games[3] + ", " +
                           games[4] + ", " + games[5] + ", " + games[6] + ", " + games[7] + ", " +
                           games[8] + ", " + games[9]);*/
						   
						   
						  for (String game: games){
							  System.out.println(game);
						  }
    }
}
