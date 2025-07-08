class RealEstateOfficeRunner {
    public static void main(String[] args) {
        String customerName = "Meena";
        int age = 40;
        long phoneNumber = 9876543210L;
        String propertyLocation = "Whitefield, Bangalore";

        RealEstateOffice.bookProperty(customerName, age, phoneNumber, propertyLocation);
    }
}