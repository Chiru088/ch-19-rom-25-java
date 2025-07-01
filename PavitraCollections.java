class PavitraCollections {
	
	static String brand1 = "Zara";
	static String brand2 = "FabIndia";
	static String brand3 = "Biba";
	static String brand4 = "W";
	static String brand5 = "Global Desi";
	static String brand6 = "Max";
	static String brand7 = "Pantaloons";
	static String brand8 = "Aurelia";

    public static void main(String[] args) {
		
		String brand1 = "Zara";
        String brand2 = "FabIndia";
        String brand3 = "Biba";
        String brand4 = "W";
        String brand5 = "Global Desi";
        String brand6 = "Max";
        String brand7 = "Pantaloons";
        String brand8 = "Aurelia";
		
        String brands[] = {
			brand1, brand2, brand3, brand4,
			brand5, brand6, brand7, brand8
		};

        /*System.out.println("In PavitraCollections, the available brands are:");
        System.out.println(brands[0] + ", " + brands[1] + ", " + brands[2] + ", " + brands[3] + ", " +
                           brands[4] + ", " + brands[5] + ", " + brands[6] + ", " + brands[7]);*/
						   
						  for (String brand : brands){
							  System.out.println(brand);
							  
						  }
    }
}
