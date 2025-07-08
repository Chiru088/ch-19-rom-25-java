class WashingMachine {
    static boolean isConnected;
    static int currentSpeed = 2;
    static int minSpeed = 0;
    static int maxSpeed = 5;

    public static void onOrOff() {
        isConnected = !isConnected;
        System.out.println("Washing Machine is now " + (isConnected ? "ON" : "OFF"));
    }

    public static void increaseSpeed() {
        if (isConnected) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached.");
            }
        } else {
            System.out.println("Please turn on the Washing Machine.");
        }
    }

    public static void decreaseSpeed() {
        if (isConnected) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached.");
            }
        } else {
            System.out.println("Please turn on the Washing Machine.");
        }
    }
}
