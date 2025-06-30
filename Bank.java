class Bank {
    static String bankName;
    static String accountHolderName;
    static int accountNumber;
    static String bankAddress;
    static long holderPhoneNumber;
    static String holderEmail;
    static String holderDOB;
    static String holderGender;
    static String holderAadhar;
    static String holderPAN;
    static int accountHolderBalance;
    static boolean netBankingEnabled;
    static boolean debitCardIssued;
    static String accountOpenedDate;
    static int dailyTransactionLimit;

    public static void main(String[] args) {

        System.out.println(bankName);
        bankName = "SBI";
        System.out.println(bankName);

        System.out.println(accountHolderName);
        accountHolderName = "Chiranjeevi";
        System.out.println(accountHolderName);

        System.out.println(accountNumber);
        accountNumber = 1234567895;
        System.out.println(accountNumber);

        System.out.println(bankAddress);
        bankAddress = "Bangalore";
        System.out.println(bankAddress);

        System.out.println(holderPhoneNumber);
        holderPhoneNumber = 4589759658L;
        System.out.println(holderPhoneNumber);

        System.out.println(holderEmail);
        holderEmail = "chiru0609@gmail.com";
        System.out.println(holderEmail);

        System.out.println(holderDOB);
        holderDOB = "06-09-1999";
        System.out.println(holderDOB);

        System.out.println(holderGender);
        holderGender = "Male";
        System.out.println(holderGender);

        System.out.println(holderAadhar);
        holderAadhar = "1234-5678-9012";
        System.out.println(holderAadhar);

        System.out.println(holderPAN);
        holderPAN = "ABCDE1234F";
        System.out.println(holderPAN);

        System.out.println(accountHolderBalance);
        accountHolderBalance = 10000;
        System.out.println(accountHolderBalance);

        System.out.println(netBankingEnabled);
        netBankingEnabled = true;
        System.out.println(netBankingEnabled);

        System.out.println(debitCardIssued);
        debitCardIssued = true;
        System.out.println(debitCardIssued);

        System.out.println(accountOpenedDate);
        accountOpenedDate = "01-01-2021";
        System.out.println(accountOpenedDate);

        System.out.println(dailyTransactionLimit);
        dailyTransactionLimit = 50000;
        System.out.println(dailyTransactionLimit);
    }
}
