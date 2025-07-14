public class HandsetRunner {

    public static void main(String[] args) {

        Handset handset = new Handset();

        String name = "chiru";
        long contactNo = handset.getContactNoByName(name);
        System.out.println("Contact for " + name + ": " + contactNo);
    }
}
