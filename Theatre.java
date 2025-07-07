class Theatre {

    static String name = "PVR Cinemas";

    public static void getProjectionDetails() {
        System.out.println("Method Started");
        String screenType = "IMAX 4K";

        System.out.println("Theatre Name: " + name);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Capacity: 300 seats");
        System.out.println("Feature: Dolby Atmos Sound");

        Projector.projectionUnit();
    }
}
