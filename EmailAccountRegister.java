class EmailAccountRegister {
    static String emailID;
    static String username;
    static String password;
    static String recoveryEmail;
    static long mobileNumber;

    public static boolean registerEmail(String email, String user, String pwd, String recovery, long phone) {
        boolean isRegistered = false;

        if (email != null && user != null && pwd != null && recovery != null && phone > 0) {
            emailID = email;
            username = user;
            password = pwd;
            recoveryEmail = recovery;
            mobileNumber = phone;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getAccountDetails() {
        System.out.println("Email ID: " + emailID);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Recovery Email: " + recoveryEmail);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}


