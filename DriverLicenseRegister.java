class DriverLicenseRegister {
    static String name;
    static String licenseNumber;
    static String dob;
    static String address;
    static String vehicleType;

    public static boolean registerLicense(String n, String licNo, String birthDate, String addr, String vType) {
        boolean isRegistered = false;

        if (n != null && licNo != null && birthDate != null && addr != null && vType != null) {
            name = n;
            licenseNumber = licNo;
            dob = birthDate;
            address = addr;
            vehicleType = vType;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getLicenseDetails() {
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("DOB: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}


