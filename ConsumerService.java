class ConsumerService {
    public static void report(String consumerName, int age, long phoneNumber, String complaint) {
        System.out.println("Started filing complaint...");

        ComplaintHandler.processComplaint(consumerName, age, complaint);
        System.out.println("Complaint has been recorded.");
    }
}




