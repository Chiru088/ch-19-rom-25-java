class Garden {
    static String name = "Lalbagh";
    static int areaInAcres = 240;
    static boolean hasPlayground = true;
    static int numberOfTrees = 5000;
    static String location = "Bangalore";
    static boolean hasFountain = true;

    public static void showDetails() {
        System.out.println("Garden Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Area: " + areaInAcres + " acres");
        System.out.println("Playground: " + hasPlayground);
        System.out.println("Number of Trees: " + numberOfTrees);
        System.out.println("Has Fountain: " + hasFountain);
    }
}


