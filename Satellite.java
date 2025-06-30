class Satellite {
    static String satelliteName;
    static String country;
    static String missionType;
    static double orbitHeightKm;
    static boolean isActive;
    static int launchYear;
    static String launchVehicle;
    static boolean hasCamera;
    static double weightKg;
    static String operatorAgency;
    static boolean isReusable;
    static int numberOfSolarPanels;
    static float powerGeneratedKW;
    static boolean communicationEnabled;
    static String manufacturer;
    static boolean hasThermalShield;
    static String signalFrequency;
    static int missionDurationYears;
    static boolean dataTransmissionEnabled;
    static String controlCenterLocation;

    public static void main(String[] args) {
        System.out.println(satelliteName);
        satelliteName = "INSAT-3D";
        System.out.println(satelliteName);

        System.out.println(country);
        country = "India";
        System.out.println(country);

        System.out.println(missionType);
        missionType = "Weather Monitoring";
        System.out.println(missionType);

        System.out.println(orbitHeightKm);
        orbitHeightKm = 36000.0;
        System.out.println(orbitHeightKm);

        System.out.println(isActive);
        isActive = true;
        System.out.println(isActive);

        System.out.println(launchYear);
        launchYear = 2013;
        System.out.println(launchYear);

        System.out.println(launchVehicle);
        launchVehicle = "GSLV-D5";
        System.out.println(launchVehicle);

        System.out.println(hasCamera);
        hasCamera = true;
        System.out.println(hasCamera);

        System.out.println(weightKg);
        weightKg = 2060.5;
        System.out.println(weightKg);

        System.out.println(operatorAgency);
        operatorAgency = "ISRO";
        System.out.println(operatorAgency);

        System.out.println(isReusable);
        isReusable = false;
        System.out.println(isReusable);

        System.out.println(numberOfSolarPanels);
        numberOfSolarPanels = 2;
        System.out.println(numberOfSolarPanels);

        System.out.println(powerGeneratedKW);
        powerGeneratedKW = 1.5f;
        System.out.println(powerGeneratedKW);

        System.out.println(communicationEnabled);
        communicationEnabled = true;
        System.out.println(communicationEnabled);

        System.out.println(manufacturer);
        manufacturer = "ISRO Satellite Centre";
        System.out.println(manufacturer);

        System.out.println(hasThermalShield);
        hasThermalShield = true;
        System.out.println(hasThermalShield);

        System.out.println(signalFrequency);
        signalFrequency = "X-band";
        System.out.println(signalFrequency);

        System.out.println(missionDurationYears);
        missionDurationYears = 10;
        System.out.println(missionDurationYears);

        System.out.println(dataTransmissionEnabled);
        dataTransmissionEnabled = true;
        System.out.println(dataTransmissionEnabled);

        System.out.println(controlCenterLocation);
        controlCenterLocation = "Hyderabad";
        System.out.println(controlCenterLocation);
    }
}
