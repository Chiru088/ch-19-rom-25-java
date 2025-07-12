class LinkedInRegister {
    static String fullName;
    static String email;
    static String password;
    static String headline;
    static String location;

    public static boolean registerUser(String name, String mail, String pwd, String hl, String loc) {
        boolean isRegistered = false;

        if (name != null && mail != null && pwd != null && hl != null && loc != null) {
            fullName = name;
            email = mail;
            password = pwd;
            headline = hl;
            location = loc;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getProfile() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Headline: " + headline);
        System.out.println("Location: " + location);
    }
}


