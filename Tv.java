class Tv{
    static boolean isConnected;
    static int currentVolume = 5;
    static int minVolume = 0;
    static int maxVolume = 10;

    public static void onOrOff() {
        isConnected = !isConnected;
        System.out.println("TV is now " + (isConnected ? "ON" : "OFF"));
    }

    public static void increaseVolume() {
        if (isConnected) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Maximum volume reached.");
            }
        } else {
            System.out.println("Please turn on the TV.");
        }
    }

    public static void decreaseVolume() {
        if (isConnected) {
            if (currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Minimum volume reached.");
            }
        } else {
            System.out.println("Please turn on the TV.");
        }
    }
}
