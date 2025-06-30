class Theatre {
    static String theatreName = "PVR Cinemas";
    static String location = "Forum Mall, Bangalore";
    static int numberOfScreens = 6;
    static int seatingCapacity = 1200;
    static boolean hasDolbyAtmos = true;
    static String currentMovie = "Pushpa 2";
    static int ticketPrice = 250;

    public static void main(String[] args) {
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Dolby Atmos Available: " + hasDolbyAtmos);
        System.out.println("Currently Showing: " + currentMovie);
        System.out.println("Ticket Price: " + ticketPrice);
    }
}
