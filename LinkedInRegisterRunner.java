class LinkedInRegisterRunner {
    public static void main(String[] args) {
        boolean isRegistered = LinkedInRegister.registerUser("Chiranjeevi Swamy", "linkedin.chiru@gmail.com", "linkedIn@123", "Software Developer", "Bangalore, India");
        System.out.println("Is LinkedIn Registered: " + isRegistered);
        LinkedInRegister.getProfile();
    }
}