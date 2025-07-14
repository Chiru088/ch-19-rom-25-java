class Market {
    static String name = "City Market";
    static int numberOfShops = 120;
    static String type = "Retail";
    static boolean isOpen = true;
    static String location = "Downtown";
    static boolean hasParking = true;

    public static void visitMarket() {
	System.out.println("Market Details:");
    System.out.println("Market Name: " + name);
    System.out.println("Market Type: " + type);
    System.out.println("Location: " + location);
    System.out.println("Number of Shops: " + numberOfShops);
    System.out.println("Is Open: " + isOpen);
    System.out.println("Has Parking: " + hasParking);
    }
}


