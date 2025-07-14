class MakeUpKit {
    static String brand = "Lakme";
    static int numberOfItems = 10;
    static boolean hasMirror = true;
    static boolean isTravelFriendly = true;
    static String colorTheme = "Rose Gold";
    static double price = 1999.0;

    public static void showKit() {
        System.out.println("Brand: " + brand);
        System.out.println("Items Count: " + numberOfItems);
        System.out.println("Color Theme: " + colorTheme);
        System.out.println("Has Mirror: " + hasMirror);
        System.out.println("Travel Friendly: " + isTravelFriendly);
        System.out.println("Price: ₹" + price);
    }
}

