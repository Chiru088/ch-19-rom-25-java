class Banner {
    static String content = "Grand Opening";
    static String color = "Red & White";
    static int height = 10;
    static int width = 4;
    static String material = "Vinyl";
    static boolean isHanging = true;

    public static void showBanner() {
        System.out.println("Banner: " + content);
        System.out.println("Color: " + color);
        System.out.println("Size: " + height + "ft x " + width + "ft");
        System.out.println("Material: " + material);
        System.out.println("Is Hanging: " + isHanging);
    }
}


