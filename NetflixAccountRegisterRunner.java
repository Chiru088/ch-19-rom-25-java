class NetflixAccountRegisterRunner {
    public static void main(String[] args) {
        boolean isRegistered = NetflixAccountRegister.registerAccount("Chiru Swamy", "netflix.chiru@gmail.com", "flix@123", "Premium", "Credit Card");
        System.out.println("Is Netflix Account Registered: " + isRegistered);
        NetflixAccountRegister.getAccountInfo();
    }
}