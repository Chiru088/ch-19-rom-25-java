class Speaker {
    static boolean isConnected;
    static int currentVolume = 2;
    static int minVolume = 0;
    static int maxVolume = 7;

    public static void onOrOf() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The speaker is turned on... " + isConnected);
        } else {
            isConnected = false;
            System.out.println("The speaker is turned off " + isConnected);
        }
    }

    // Increase Volume
    public static void increseVolume() {
        System.out.println("increseVolume is started");
        if (isConnected == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("The Current volume is " + currentVolume);
            } else {
                System.out.println("Max volume reached");
            }
        } else {
            System.out.println("Please turn on the speaker...");
        }
        System.out.println("increseVolume is ended");
    }

    // Decrease Volume
    public static void decreaseVolume() {
        System.out.println("decreaseVolume is started");
        if (isConnected == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("Min volume reached");
            }
        } else {
            System.out.println("Please turn on the speaker...");
        }
        System.out.println("decreaseVolume is ended");
    }
}
