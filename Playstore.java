class PlayStore {
	/*static String app1 = "WhatsApp";
	static String app2 = "Instagram";
	static String app3 = "Snapchat";
	static String app4 = "Spotify";
	static String app5 = "YouTube";
	static String app6 = "Google Maps";
	static String app7 = "Amazon";
	static String app8 = "Swiggy";
	static String app9 = "Zomato";
	static String app10 = "Paytm";*/

    public static void main(String[] args) {
		
		String app1 = "WhatsApp";
        String app2 = "Instagram";
        String app3 = "Snapchat";
        String app4 = "Spotify";
        String app5 = "YouTube";
        String app6 = "Google Maps";
        String app7 = "Amazon";
        String app8 = "Swiggy";
        String app9 = "Zomato";
        String app10 = "Paytm";
        String appNames[] = {
			app1, app2, app3, app4, app5,
			app6, app7, app8, app9, app10
		};

       /* System.out.println("In PlayStore, the popular apps are:");
        System.out.println(appNames[0] + ", " + appNames[1] + ", " + appNames[2] + ", " + appNames[3] + ", " +
                           appNames[4] + ", " + appNames[5] + ", " + appNames[6] + ", " + appNames[7] + ", " +
                           appNames[8] + ", " + appNames[9]);*/
						   
						   
						  for (String appName : appNames){
							  System.out.println(appName);
						  }
						   
	   		   
    }
}
