class City {
	
	/*static String pin1 = "560001";
	static String pin2 = "560002";
	static String pin3 = "560003";
	static String pin4 = "560004";
	static String pin5 = "560005";
	static String pin6 = "560006";
	static String pin7 = "560007";
	static String pin8 = "560008";
	static String pin9 = "560009";
	static String pin10 = "560010";
	static String pin11 = "560011";
	static String pin12 = "560012";
	static String pin13 = "560013";*/
    public static void main(String[] args) {
		
		
        String pin1 = "560001";
        String pin2 = "560002";
        String pin3 = "560003";
        String pin4 = "560004";
        String pin5 = "560005";
        String pin6 = "560006";
        String pin7 = "560007";
        String pin8 = "560008";
        String pin9 = "560009";
        String pin10 = "560010";
        String pin11 = "560011";
        String pin12 = "560012";
        String pin13 = "560013";
		
		
        String pinCodes[] = {
			pin1, pin2, pin3, pin4, pin5,
			pin6, pin7, pin8, pin9, pin10,
			pin11, pin12, pin13
		};

        /*System.out.println("In City, the PIN codes are:");
        System.out.println(pinCodes[0] + ", " + pinCodes[1] + ", " + pinCodes[2] + ", " + pinCodes[3] + ", " +
                           pinCodes[4] + ", " + pinCodes[5] + ", " + pinCodes[6] + ", " + pinCodes[7] + ", " +
                           pinCodes[8] + ", " + pinCodes[9] + ", " + pinCodes[10] + ", " + pinCodes[11] + ", " +
                           pinCodes[12]);*/
						   
						  for (String pinCode : pinCodes){
							  System.out.println(pinCode);
						  }
    }
}
