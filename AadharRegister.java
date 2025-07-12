class AadharRegister {
    static String fullName;
    static String dob;
    static String gender;
    static String address;
    static long aadharNumber;

    public static boolean registerUser(String name, String dobVal, String gen, String addr, long aadharNum) {
        boolean isRegistered = false;

        if (name != null && dobVal != null && gen != null && addr != null && aadharNum > 0) {
            fullName = name;
            dob = dobVal;
            gender = gen;
            address = addr;
            aadharNumber = aadharNum;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Aadhar Number: " + aadharNumber);
    }
}

