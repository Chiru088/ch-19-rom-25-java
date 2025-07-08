class Fan {
    static boolean isOn;
    static int currentSpeed = 0;
    static int maxSpeed = 5;

    public static void onOrOf() {
        isOn = !isOn;
        if (isOn) {
            System.out.println("Fan is turned ON");
        } else {
            System.out.println("Fan is turned OFF");
            currentSpeed = 0;
        }
    }

    public static void increaseSpeed() {
        if (isOn && currentSpeed < maxSpeed) {
            currentSpeed++;
            System.out.println("Fan speed increased to " + currentSpeed);
        } else if (!isOn) {
            System.out.println("Cannot increase speed. Fan is OFF");
        } else {
            System.out.println("Fan is already at max speed.");
        }
    }

    public static void decreaseSpeed() {
        if (isOn && currentSpeed > 0) {
            currentSpeed--;
            System.out.println("Fan speed decreased to " + currentSpeed);
        } else if (!isOn) {
            System.out.println("Cannot decrease speed. Fan is OFF");
        } else {
            System.out.println("Fan is already at minimum speed.");
        }
    }
}
