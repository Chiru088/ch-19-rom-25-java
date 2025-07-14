class DisneyLand {
    static String location = "California";
    static int totalRides = 60;
    static boolean hasWaterPark = true;
    static int openingYear = 1955;
    static double ticketPrice = 150.0;
    static boolean isOpenToday = true;

    public static void parkInfo() {
        System.out.println("Location: " + location);
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Water Park: " + hasWaterPark);
        System.out.println("Opened In: " + openingYear);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Open Today: " + isOpenToday);
    }
}


