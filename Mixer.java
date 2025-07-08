class Mixer{
	static boolean isConnected;
	static int currentSpeed = 2;
	static int minSpeed = 0;
	static int maxSpeed = 7;
	
	public static void onOrOf(){
		if (isConnected == false){
			isConnected = true;
			System.out.println("The mixer is turned on "+ isConnected);
		}else{
			isConnected = false;
			System.out.println("The mixer is turned off "+ isConnected);
		} 
	}
	
	public static void increseSpeed(){
		System.out.println("increseSpeed is stared");
		if(isConnected == true){
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed + 1;
				System.out.println("The current speed is "+ currentSpeed);
			}else{
				System.out.println("max Speed is reached");
			}
		} else{
			System.out.println("please turn on mixer");
		}
		System.out.println("increseSpeed is ended");
	}
	   public static void decreaseSpeed() {
        System.out.println("decreaseSpeed is started");
        if (isConnected == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("The Current Speed is " + currentSpeed);
            } else {
                System.out.println("Min speed reached");
            }
        } else {
            System.out.println("Please turn on the mixer...");
        }
        System.out.println("decreaseSpeed is ended");
    }
	
	
	
}