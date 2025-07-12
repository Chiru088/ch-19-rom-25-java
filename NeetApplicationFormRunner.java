public class NeetApplicationFormRunner {
    public static void main(String[] args) {
        boolean registered = NeetApplicationForm.applicationForm("Chiranjeevi", "S", 9876543210L, "chiru@example.com", 21);

        if (registered) {
            System.out.println("Application submitted successfully");
            System.out.println("First Name: " + NeetApplicationForm.getfirstName());
            System.out.println("Surname: " + NeetApplicationForm.getsurName());
            System.out.println("Phone Number: " + NeetApplicationForm.getphoneNumber());
            System.out.println("Email: " + NeetApplicationForm.getuserMail());
            System.out.println("Age: " + NeetApplicationForm.getuserAge());
            //System.out.println("Gender: " + NeetApplicationForm.getuserGender());
        } else {
            System.out.println("Application submission failed. Please check the inputs.");
        }
    }
}
