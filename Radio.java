class Radio {
    static String brand = "Sony";
    static String type = "FM/AM";
    static boolean isPortable = true;
    static int volumeLevel = 5;
    static boolean isWorking = true;
    static String color = "Black";

    public static void getplayRadio() {
        System.out.println("Playing radio on " + brand + " - Type: " + type);
        System.out.println("Portable: " + isPortable);
        System.out.println("Volume Level: " + volumeLevel);
        System.out.println("Color: " + color);
        System.out.println("Working: " + isWorking);
    }
}

