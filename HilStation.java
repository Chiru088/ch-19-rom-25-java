class HilStation {
	
	static String resort1 = "Club Mahindra";
	static String resort2 = "Sterling Resorts";
	static String resort3 = "Ooty Fern Hill";
	static String resort4 = "Kodai Lake View";
	static String resort5 = "Coorg Wilderness";
	static String resort6 = "Mystic Valley";
	static String resort7 = "Nandi Hills Resort";

    public static void main(String[] args) {
		
		String resort1 = "Club Mahindra";
        String resort2 = "Sterling Resorts";
        String resort3 = "Ooty Fern Hill";
        String resort4 = "Kodai Lake View";
        String resort5 = "Coorg Wilderness";
        String resort6 = "Mystic Valley";
        String resort7 = "Nandi Hills Resort";
		
        String resorts[] = {
			resort1, resort2, resort3, resort4,
			resort5, resort6, resort7
		};


        /*System.out.println("In HillStation, the famous resorts are:");
        System.out.println(resorts[0] + ", " + resorts[1] + ", " + resorts[2] + ", " + resorts[3] + ", " +
                           resorts[4] + ", " + resorts[5] + ", " + resorts[6]);*/
						   
						  for (String resort : resorts){
							  System.out.println(resort);
						  }
    }
}
