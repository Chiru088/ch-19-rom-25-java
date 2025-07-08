class ConsumerServiceRunner {
    public static void main(String[] args) {
        String consumerName = "Anjali";
        int age = 35;
        long phoneNumber = 9876543210L;
        String complaint = "Defective washing machine";

        ConsumerService.report(consumerName, age, phoneNumber, complaint);
    }
}
