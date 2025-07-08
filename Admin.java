class Admin {
    public static void checkAndApprove(String employeeName, int empId, String laptopModel) {
        System.out.println("Admin approval in progress...");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Laptop Model: " + laptopModel);

        SupportStaff.assist(employeeName);

        System.out.println("Admin approval completed.");
    }
}