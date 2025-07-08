class ShoppingMall {
    public static void buy(String customerName, int age, long phoneNumber, String productName) {
        System.out.println("Started buying product...");

        Cashier.generateBill(customerName, age, productName);
        System.out.println("Purchase completed...");
    }
}



