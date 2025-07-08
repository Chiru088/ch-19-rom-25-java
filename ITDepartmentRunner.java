class ITDepartmentRunner {
    public static void main(String[] args) {
        String employeeName = "Karthik";
        int empId = 1023;
        String department = "Software Development";
        String laptopModel = "Dell Latitude 5420";

        ITDepartment.issueLaptop(employeeName, empId, department, laptopModel);
    }
}