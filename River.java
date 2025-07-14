class River {
    static String name = "Ganga";
    static String origin = "Gangotri Glacier";
    static String country = "India";
    static double lengthInKm = 2525;
    static boolean isPolluted = true;
    static boolean isHoly = true;

    public static void showInfo() {
        System.out.println("River Name: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Country: " + country);
        System.out.println("Length: " + lengthInKm + " km");
        System.out.println("Is Polluted: " + isPolluted);
        System.out.println("Is Holy: " + isHoly);
    }
}


