class SwitchBoard {
    static String brand;
    static int numberOfSwitches;
    static int numberOfSockets;
    static boolean hasIndicatorLight;
    static boolean isModular;
    static String materialType;
    static String color;
    static double widthCm;
    static double heightCm;
    static boolean isShockProof;
    static int maxCurrentAmp;
    static int voltageRating;
    static boolean isFireResistant;
    static boolean isWaterResistant;
    static int numberOfFansControlled;
    static boolean hasUSBPort;
    static String mountedType;
    static String installationArea;
    static boolean isChildSafe;
    static String manufacturingCountry;

    public static void main(String[] args) {
        System.out.println(brand);
        brand = "Anchor";
        System.out.println(brand);

        System.out.println(numberOfSwitches);
        numberOfSwitches = 6;
        System.out.println(numberOfSwitches);

        System.out.println(numberOfSockets);
        numberOfSockets = 3;
        System.out.println(numberOfSockets);

        System.out.println(hasIndicatorLight);
        hasIndicatorLight = true;
        System.out.println(hasIndicatorLight);

        System.out.println(isModular);
        isModular = true;
        System.out.println(isModular);

        System.out.println(materialType);
        materialType = "Polycarbonate";
        System.out.println(materialType);

        System.out.println(color);
        color = "White";
        System.out.println(color);

        System.out.println(widthCm);
        widthCm = 20.5;
        System.out.println(widthCm);

        System.out.println(heightCm);
        heightCm = 10.0;
        System.out.println(heightCm);

        System.out.println(isShockProof);
        isShockProof = true;
        System.out.println(isShockProof);

        System.out.println(maxCurrentAmp);
        maxCurrentAmp = 16;
        System.out.println(maxCurrentAmp);

        System.out.println(voltageRating);
        voltageRating = 240;
        System.out.println(voltageRating);

        System.out.println(isFireResistant);
        isFireResistant = true;
        System.out.println(isFireResistant);

        System.out.println(isWaterResistant);
        isWaterResistant = false;
        System.out.println(isWaterResistant);

        System.out.println(numberOfFansControlled);
        numberOfFansControlled = 2;
        System.out.println(numberOfFansControlled);

        System.out.println(hasUSBPort);
        hasUSBPort = true;
        System.out.println(hasUSBPort);

        System.out.println(mountedType);
        mountedType = "Wall Mounted";
        System.out.println(mountedType);

        System.out.println(installationArea);
        installationArea = "Living Room";
        System.out.println(installationArea);

        System.out.println(isChildSafe);
        isChildSafe = true;
        System.out.println(isChildSafe);

        System.out.println(manufacturingCountry);
        manufacturingCountry = "India";
        System.out.println(manufacturingCountry);
    }
}
