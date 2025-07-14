class Tailor {
    static String name = "Ramesh";
    static int experienceYears = 12;
    static String specialization = "Men's Suits";
    static boolean homeService = true;
    static String shopName = "Elite Tailors";
    static double stitchPrice = 850.0;

    public static void showTailorInfo() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Specialization: " + specialization);
        System.out.println("Home Service: " + homeService);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Stitching Price: ₹" + stitchPrice);
    }
}

