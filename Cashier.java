class Cashier {
    public static void generateBill(String customerName, int age, String productName) {
        System.out.println("Billing in process...");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Age: " + age);

        Helper.assist(customerName);

        System.out.println("Bill generated successfully.");
    }
}