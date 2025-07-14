class Signal{
     static String location = "Rajajnagar";
	 static boolean isWorking = true;
	 static int redDuration = 60;
	 static int greenDuration = 45;
	 static int yellowDuration = 5;
	 static boolean isSensorBased = true;



   public static void operateSignal(){
        System.out.println("Signal at " + location);
        System.out.println("Red: " + redDuration + "s, Green: " + greenDuration + "s, Yellow: " + yellowDuration + "s");
        System.out.println("Sensor Based: " + isSensorBased + ", Working: " + isWorking);

   
   
   }


}