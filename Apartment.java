class Apartment {
    static String apartmentName = "Skyline Heights";
    static String location = "Electronic City, Bangalore";
    static int numberOfFlats = 80;
    static int numberOfFloors = 10;
    static boolean hasLift = true;
    static boolean hasSecurity = true;
    static int maintenanceFee = 2500;

    public static void main(String[] args) {
        System.out.println("Apartment Name: " + apartmentName);
        System.out.println("Location: " + location);
        System.out.println("Number of Flats: " + numberOfFlats);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Lift Available: " + hasLift);
        System.out.println("Security Available: " + hasSecurity);
        System.out.println("Maintenance Fee: " + maintenanceFee);
    }
}
