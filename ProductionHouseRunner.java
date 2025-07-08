class ProductionHouseRunner {
    public static void main(String[] args) {
        String directorName = "Rajkumar Hirani";
        String movieTitle = "Dream Big";
        String genre = "Drama";
        int budget = 80;

        ProductionHouse.makeMovie(directorName, movieTitle, genre, budget);
    }
}