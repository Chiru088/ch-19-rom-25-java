class Temple {
    static String templeName;
    static String location;
    static int numberOfPriests;
    static boolean hasGarden;
    static int dailyVisitors;
    static String deity;

    public static void main(String[] args) {
        System.out.println(templeName);
        templeName = "ISKCON Temple";
        System.out.println(templeName);

        System.out.println(location);
        location = "Rajajinagar, Bangalore";
        System.out.println(location);

        System.out.println(numberOfPriests);
        numberOfPriests = 5;
        System.out.println(numberOfPriests);

        System.out.println(hasGarden);
        hasGarden = true;
        System.out.println(hasGarden);

        System.out.println(dailyVisitors);
        dailyVisitors = 3000;
        System.out.println(dailyVisitors);

        System.out.println(deity);
        deity = "Lord Krishna";
        System.out.println(deity);
    }
}
