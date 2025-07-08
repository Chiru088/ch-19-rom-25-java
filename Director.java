class Director {
    public static void startShooting(String directorName, String movieTitle, String genre) {
        System.out.println("Shooting started...");
        System.out.println("Director: " + directorName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Genre: " + genre);

        AssistantDirector.coordinate(directorName);

        System.out.println("Shooting is in progress...");
    }
}
