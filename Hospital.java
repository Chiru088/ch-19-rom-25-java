class Hospital {
	
	/*static String doctor1 = "Dr. Mehta";
	static String doctor2 = "Dr. Suresh";
	static String doctor3 = "Dr. Priya";
	static String doctor4 = "Dr. Anil";
	static String doctor5 = "Dr. Rekha";
	static String doctor6 = "Dr. Raj";
	static String doctor7 = "Dr. Neha";
	static String doctor8 = "Dr. Arun";
	static String doctor9 = "Dr. Divya";
	static String doctor10 = "Dr. Thomas";*/
	
    public static void main(String[] args) {
		String doctor1 = "Dr. Mehta";
        String doctor2 = "Dr. Suresh";
        String doctor3 = "Dr. Priya";
        String doctor4 = "Dr. Anil";
        String doctor5 = "Dr. Rekha";
        String doctor6 = "Dr. Raj";
        String doctor7 = "Dr. Neha";
        String doctor8 = "Dr. Arun";
        String doctor9 = "Dr. Divya";
        String doctor10 = "Dr. Thomas";
		
        String doctorNames[] = {
			doctor1, doctor2, doctor3, doctor4, doctor5,
			doctor6, doctor7, doctor8, doctor9, doctor10
		};

        /*System.out.println("In Hospital, the doctors are:");
        System.out.println(doctorNames[0] + ", " + doctorNames[1] + ", " + doctorNames[2] + ", " + doctorNames[3] + ", " +
                           doctorNames[4] + ", " + doctorNames[5] + ", " + doctorNames[6] + ", " + doctorNames[7] + ", " +
                           doctorNames[8] + ", " + doctorNames[9]);*/
						   
						  for (String doctorName : doctorNames){
							  System.out.println(doctorName);
						  }
    }
}
