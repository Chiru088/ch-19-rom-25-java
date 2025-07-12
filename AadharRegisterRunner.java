class AadharRegisterRunner {
    public static void main(String[] args) {
        boolean isRegistered = AadharRegister.registerUser("Chiranjeevi Swamy", "06-Sep-2003", "Male", "Bangalore, India", 789654123012L);
        System.out.println("Is Aadhar Registered: " + isRegistered);
        AadharRegister.getUserInfo();
    }
}
