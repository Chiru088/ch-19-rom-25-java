class RealEstateOffice {
    public static void bookProperty(String customerName, int age, long phoneNumber, String propertyLocation) {
        System.out.println("Property booking process started...");

        SalesManager.processBooking(customerName, age, propertyLocation);
        System.out.println("Property has been successfully booked.");
    }
}




