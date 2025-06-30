class Hospital {
    public static void main(String[] args) {
        String doctorNames[] = {
            "Dr. Mehta", "Dr. Suresh", "Dr. Priya", "Dr. Anil", "Dr. Rekha",
            "Dr. Raj", "Dr. Neha", "Dr. Arun", "Dr. Divya", "Dr. Thomas"
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
