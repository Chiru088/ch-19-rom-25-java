class Ac{
    static boolean isConnected;
    static int currentTemperature = 5;
    static int minTemperature = 7;
    static int maxTemperature = 10;

    public static void onOrOff() {
        isConnected = !isConnected;
        System.out.println("AC is now " + (isConnected ? "ON" : "OFF"));
    }

    public static void increaseTemperature() {
        if (isConnected) {
            if (currentTemperature < maxTemperature) {
                currentTemperature++;
                System.out.println("Current Temperature: " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached.");
            }
        } else {
            System.out.println("Please turn on the AC.");
        }
    }

    public static void decreaseTemperature() {
        if (isConnected) {
            if (currentTemperature > minTemperature) {
                currentTemperature--;
                System.out.println("Current Temperature: " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached.");
            }
        } else {
            System.out.println("Please turn on the AC.");
        }
    }
}


