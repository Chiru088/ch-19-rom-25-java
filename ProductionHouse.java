class ProductionHouse {
    public static void makeMovie(String directorName, String movieTitle, String genre, int budget) {
        System.out.println("Movie production process started...");

        Director.startShooting(directorName, movieTitle, genre);
        System.out.println("Movie production is ongoing with a budget of ₹" + budget + " lakhs.");
    }
}





