class EmailAccountRegisterRunner {
    public static void main(String[] args) {
        boolean isRegistered = EmailAccountRegister.registerEmail("chiru@gmail.com", "chiru123", "pass@123", "altchiru@gmail.com", 9911223344L);
        System.out.println("Is Email Registered: " + isRegistered);
        EmailAccountRegister.getAccountDetails();
    }
}