class Cooler {
    static boolean isConnected;
    static int currentSpeed = 1;
    static int minSpeed = 0;
    static int maxSpeed = 5;

    public static void onOrOff() {
        isConnected = !isConnected;
        System.out.println("Cooler is now " + (isConnected ? "ON" : "OFF"));
    }

    public static void increaseSpeed() {
        System.out.println("increaseSpeed is started");
        if (isConnected) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached.");
            }
        } else {
            System.out.println("Please turn on the Cooler.");
        }
        System.out.println("increaseSpeed is ended");
    }

    public static void decreaseSpeed() {
        System.out.println("decreaseSpeed is started");
        if (isConnected) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached.");
            }
        } else {
            System.out.println("Please turn on the Cooler.");
        }
        System.out.println("decreaseSpeed is ended");
    }
}
