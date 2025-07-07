class Airport {
    
    static String name = "Kempegowda International Airport";
    
    public static void getATCDetails() {
        System.out.println("Method Started");
        int runways = 2;
        
        System.out.println("Airport Name: " + name);
        System.out.println("Number of Runways: " + runways);
        System.out.println("Type: International");
        System.out.println("Special Service: Automated Check-in, Smart Gates");

        AirTrafficControl.controlRoom();
    }
}
