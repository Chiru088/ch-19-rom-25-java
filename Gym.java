class Gym {
    static String gymName;
    static String ownerName;
    static int numberOfTrainers;
    static int numberOfMembers;
    static boolean isOpen24Hours;
    static double monthlyFee;
    static long contactNumber;
    static float gymAreaInSqFeet;
    static char gymGrade;
    static byte gymRating;
    static short totalLockers;
    static StringBuilder gymNotes;
    static StringBuffer specialOffers;
    static Integer activeBranches;
    static Double powerConsumed;
    static Boolean hasSwimmingPool;
    static Character shiftCode;
    static Short openingHour;
    static Byte discountPercent;
    static Object franchiseInfo;

    public static void main(String[] args) {
        System.out.println(gymName);
        gymName = "Muscle Factory Gym";
        System.out.println(gymName);

        System.out.println(ownerName);
        ownerName = "Rakesh Shetty";
        System.out.println(ownerName);

        System.out.println(numberOfTrainers);
        numberOfTrainers = 5;
        System.out.println(numberOfTrainers);

        System.out.println(numberOfMembers);
        numberOfMembers = 120;
        System.out.println(numberOfMembers);

        System.out.println(isOpen24Hours);
        isOpen24Hours = true;
        System.out.println(isOpen24Hours);

        System.out.println(monthlyFee);
        monthlyFee = 1499.99;
        System.out.println(monthlyFee);

        System.out.println(contactNumber);
        contactNumber = 9876543210L;
        System.out.println(contactNumber);

        System.out.println(gymAreaInSqFeet);
        gymAreaInSqFeet = 2500.75f;
        System.out.println(gymAreaInSqFeet);

        System.out.println(gymGrade);
        gymGrade = 'A';
        System.out.println(gymGrade);

        System.out.println(gymRating);
        gymRating = 4;
        System.out.println(gymRating);

        System.out.println(totalLockers);
        totalLockers = 60;
        System.out.println(totalLockers);

        System.out.println(gymNotes);
        gymNotes = new StringBuilder("Open 365 days");
        System.out.println(gymNotes);

        System.out.println(specialOffers);
        specialOffers = new StringBuffer("Buy 1 month, get 1 free");
        System.out.println(specialOffers);

        System.out.println(activeBranches);
        activeBranches = 7;
        System.out.println(activeBranches);

        System.out.println(powerConsumed);
        powerConsumed = 1050.5;
        System.out.println(powerConsumed);

        System.out.println(hasSwimmingPool);
        hasSwimmingPool = true;
        System.out.println(hasSwimmingPool);

        System.out.println(shiftCode);
        shiftCode = 'M';
        System.out.println(shiftCode);

        System.out.println(openingHour);
        openingHour = 6;
        System.out.println(openingHour);

        System.out.println(discountPercent);
        discountPercent = 10;
        System.out.println(discountPercent);

        System.out.println(franchiseInfo);
        franchiseInfo = "Owned by MF Group";
        System.out.println(franchiseInfo);
    }
}
