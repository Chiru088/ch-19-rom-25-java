class Gold {
    static double weightInGrams = 24.5;
    static String type = "Necklace";
    static double pricePerGram = 5800;
    static String purity = "22K";
    static boolean isHallmarked = true;
    static String shop = "Malabar Gold";

    public static void showGoldDetails() {
    System.out.println("Type: " + type);
    System.out.println("Shop: " + shop);
    System.out.println("Purity: " + purity);
    System.out.println("Weight in grams: " + weightInGrams);
    System.out.println("Hallmarked: " + isHallmarked);
    System.out.println("Price per gram: ₹" + pricePerGram);
    System.out.println("Estimated Total Price: ₹" + (weightInGrams * pricePerGram));
}
}


