class NetflixAccountRegister {
    static String fullName;
    static String email;
    static String password;
    static String subscriptionPlan;
    static String paymentMethod;

    public static boolean registerAccount(String name, String mail, String pwd, String plan, String payment) {
        boolean isRegistered = false;

        if (name != null && mail != null && pwd != null && plan != null && payment != null) {
            fullName = name;
            email = mail;
            password = pwd;
            subscriptionPlan = plan;
            paymentMethod = payment;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getAccountInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Plan: " + subscriptionPlan);
        System.out.println("Payment Method: " + paymentMethod);
    }
}


