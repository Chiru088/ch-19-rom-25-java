class DriverLicenseRegisterRunner {
    public static void main(String[] args) {
        boolean isRegistered = DriverLicenseRegister.registerLicense("Chiranjeevi Swamy", "KA01AB1234", "06-Sep-2003", "Bangalore", "Two Wheeler");
        System.out.println("Is License Registered: " + isRegistered);
        DriverLicenseRegister.getLicenseDetails();
    }
}