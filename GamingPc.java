class GamingPc {
    static String cpu = "Intel i9";
    static String gpu = "NVIDIA RTX 4080";
    static int ramGB = 32;
    static int storageGB = 1000;
    static boolean hasRGB = true;
    static String brand = "Alienware";

    public static void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB SSD");
        System.out.println("RGB Lighting: " + hasRGB);
    }
}

