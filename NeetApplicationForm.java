class NeetApplicationForm {
    static String firstName;
    static String surName;
    static long phoneNumber;
    static String userMail;
    static int userAge;
    // static char userGender;

    public static boolean applicationForm(String fName, String sName, long pNumber, String uMail, int uAge) {
        boolean isRegistered = false;

        if (fName != null) {
            firstName = fName;
        }

        if (sName != null) {
            surName = sName;
        }

        if (pNumber > 0) {
            phoneNumber = pNumber;  
        }

        if (uMail != null) {
            userMail = uMail;  
        }

        if (uAge > 0) {
            userAge = uAge;  
        }

        if (firstName != null && surName != null && phoneNumber > 0 && userMail != null && userAge > 0) {
            isRegistered = true; 
        }

        return isRegistered;  
    }

    public static String getfirstName() {
        return firstName;
    }

    public static String getsurName() {
        return surName;
    }

    public static long getphoneNumber() {
        return phoneNumber;
    }

    public static String getuserMail() {
        return userMail;
    }

    public static int getuserAge() {
        return userAge;
    }

    // public static char getuserGender() {
    //     return userGender;
    // }
}
