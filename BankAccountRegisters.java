class BankAccountRegisters {
    static String accountHolder;
    static long accountNumber;
    static String bankName;
    static double balance;
    static String accountType;

    public static boolean registerAccount(String holder, long accNum, String bName, double bal, String accType) {
        boolean isRegistered = false;

        if (holder != null && accNum > 0 && bName != null && bal >= 0 && accType != null) {
            accountHolder = holder;
            accountNumber = accNum;
            bankName = bName;
            balance = bal;
            accountType = accType;
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }
}


