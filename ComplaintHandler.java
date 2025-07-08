class ComplaintHandler {
    public static void processComplaint(String consumerName, int age, String complaint) {
        System.out.println("Processing complaint...");
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Age: " + age);
        System.out.println("Complaint: " + complaint);

        Assistant.assist(consumerName);

        System.out.println("Complaint processed successfully.");
    }
}