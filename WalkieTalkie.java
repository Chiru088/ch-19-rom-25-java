class WalkieTalkie {
    static String model = "Motorola XTR";
    static int rangeInKm = 5;
    static boolean isEncrypted = true;
    static int batteryLifeHours = 12;
    static boolean isCharged = true;
    static String usageBy = "Security";

    public static void transmit() {
        System.out.println("Walkie-Talkie Model: " + model + " used by " + usageBy);
        System.out.println("Range: " + rangeInKm + "km, Battery: " + batteryLifeHours + "h");
        System.out.println("Encrypted: " + isEncrypted + ", Charged: " + isCharged);
    }
}
