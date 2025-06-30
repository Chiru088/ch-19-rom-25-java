class Satellite {
    static String satelliteName = "Chandrayaan-3";
    static String country = "India";
    static String launchedBy = "ISRO";
    static String purpose = "Lunar Exploration";
    static boolean isActive = true;
    static int weightKg = 1749;
    static String launchDate = "14 July 2023";

    public static void main(String[] args) {
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Launched By: " + launchedBy);
        System.out.println("Purpose: " + purpose);
        System.out.println("Currently Active: " + isActive);
        System.out.println("Weight : " + weightKg);
        System.out.println("Launch Date: " + launchDate);
    }
}
