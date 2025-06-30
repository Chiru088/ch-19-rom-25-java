class Desktop {
    static String brand = "HP";
    static String processor = "Intel Core i5";
    static int ramSizeGB = 16;
    static int storageSizeGB = 512;
    static String storageType = "SSD";
    static String operatingSystem = "Windows 11";
    static boolean hasGraphicsCard = true;
    static String monitorSize = "24 inches";
    static int price = 55000;

    public static void main(String[] HP) {
        System.out.println("Desktop Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSizeGB + "GB");
        System.out.println("Storage: " + storageSizeGB + "GB " + storageType);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Graphics Card Included: " + hasGraphicsCard);
        System.out.println("Monitor Size: " + monitorSize);
        System.out.println("Price: " + price);
    }
}
