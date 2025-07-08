class ITDepartment {
    public static void issueLaptop(String employeeName, int empId, String department, String laptopModel) {
        System.out.println("Laptop issuance process started...");

        Admin.checkAndApprove(employeeName, empId, laptopModel);
        System.out.println("Laptop issued successfully.");
    }
}





