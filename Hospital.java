class Hospital {

    static String name = "Apollo Multi-Speciality Hospital";

    public static void getDoctorDetails() {
        System.out.println("Method Started");
        int experience = 15;

        System.out.println("Doctor Name: Dr. Smith");
        System.out.println("Experience: " + experience + " years");
        System.out.println("Specialization: Cardiology");
        System.out.println("Consultation: Available Mon–Fri");

        Doctor.departmentInfo();
    }
}
