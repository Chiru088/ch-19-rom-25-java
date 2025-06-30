class Projector {
    static String brand = "Epson";
    static String model = "EH-TW650";
    static boolean isPortable = true;
    static String resolution = "Full HD (1920x1080)";
    static int brightnessLumens = 3100;
    static double price = 45000.00;

    public static void main(String[] args) {
        System.out.println("Projector Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Is Portable: " + isPortable);
        System.out.println("Resolution: " + resolution);
        System.out.println("Brightness (Lumens): " + brightnessLumens);
        System.out.println("Price: ₹" + price);
    }
}
