class SalesManager {
    public static void processBooking(String customerName, int age, String propertyLocation) {
        System.out.println("Processing property booking...");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Age: " + age);
        System.out.println("Property Location: " + propertyLocation);

        PropertyAgent.assist(customerName);

        System.out.println("Booking processed and confirmed.");
    }
}
