class BankAccountRegistersRunner {
    public static void main(String[] args) {
		
        boolean isRegistered = BankAccountRegistersRunner.registerAccount("Chiranjeevi", 1234567890L, "SBI", 25000.0, "Savings");
        System.out.println("Is Bank Account Registered: " + isRegistered);
        BankAccountRegistersRunner.getAccountInfo();
    }
}
