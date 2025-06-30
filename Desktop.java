class Desktop {
    static String brand;
    static String processor;
    static int ramSizeGB;
    static int storageSizeGB;
    static String storageType;
    static String operatingSystem;
    static double screenSizeInches;
    static boolean hasWebcam;
    static boolean hasWiFi;
    static String graphicsCard;
    static boolean hasBluetooth;
    static int numberOfUSBPorts;
    static String keyboardType;
    static boolean hasHDMI;
    static String color;
    static double weightKg;
    static String powerSupply;
    static String modelNumber;
    static String warrantyPeriod;
    static double priceINR;

    public static void main(String[] args) {
        System.out.println(brand);
        brand = "HP";
        System.out.println(brand);

        System.out.println(processor);
        processor = "Intel Core i7";
        System.out.println(processor);

        System.out.println(ramSizeGB);
        ramSizeGB = 16;
        System.out.println(ramSizeGB);

        System.out.println(storageSizeGB);
        storageSizeGB = 1024;
        System.out.println(storageSizeGB);

        System.out.println(storageType);
        storageType = "SSD";
        System.out.println(storageType);

        System.out.println(operatingSystem);
        operatingSystem = "Windows 11";
        System.out.println(operatingSystem);

        System.out.println(screenSizeInches);
        screenSizeInches = 24.0;
        System.out.println(screenSizeInches);

        System.out.println(hasWebcam);
        hasWebcam = true;
        System.out.println(hasWebcam);

        System.out.println(hasWiFi);
        hasWiFi = true;
        System.out.println(hasWiFi);

        System.out.println(graphicsCard);
        graphicsCard = "NVIDIA GTX 1650";
        System.out.println(graphicsCard);

        System.out.println(hasBluetooth);
        hasBluetooth = true;
        System.out.println(hasBluetooth);

        System.out.println(numberOfUSBPorts);
        numberOfUSBPorts = 6;
        System.out.println(numberOfUSBPorts);

        System.out.println(keyboardType);
        keyboardType = "Mechanical";
        System.out.println(keyboardType);

        System.out.println(hasHDMI);
        hasHDMI = true;
        System.out.println(hasHDMI);

        System.out.println(color);
        color = "Black";
        System.out.println(color);

        System.out.println(weightKg);
        weightKg = 6.5;
        System.out.println(weightKg);

        System.out.println(powerSupply);
        powerSupply = "450W";
        System.out.println(powerSupply);

        System.out.println(modelNumber);
        modelNumber = "HP-EliteDesk-800";
        System.out.println(modelNumber);

        System.out.println(warrantyPeriod);
        warrantyPeriod = "3 Years";
        System.out.println(warrantyPeriod);

        System.out.println(priceINR);
        priceINR = 75000.0;
        System.out.println(priceINR);
    }
}
