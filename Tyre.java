class Tyre {
    static String brand = "MRF";
    static int sizeInInches = 16;
    static boolean isTubeless = true;
    static String type = "Radial";
    static boolean isUsed = false;
    static double price = 4200.0;

    public static void displayTyreDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Type: " + type);
        System.out.println("Tubeless: " + isTubeless);
        System.out.println("Used: " + isUsed);
        System.out.println("Price: ₹" + price);
    }
}


