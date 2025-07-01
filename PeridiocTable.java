class PeridiocTable {
	
	
	
	/*static String element1 = "Hydrogen";
	static String element2 = "Helium";
	static String element3 = "Lithium";
	static String element4 = "Beryllium";
	static String element5 = "Boron";
	static String element6 = "Carbon";
	static String element7 = "Nitrogen";
	static String element8 = "Oxygen";
	static String element9 = "Fluorine";
	static String element10 = "Neon";
	static String element11 = "Sodium";
	static String element12 = "Magnesium";*/
	
    public static void main(String[] args) {
		
		String element1 = "Hydrogen";
        String element2 = "Helium";
        String element3 = "Lithium";
        String element4 = "Beryllium";
        String element5 = "Boron";
        String element6 = "Carbon";
        String element7 = "Nitrogen";
        String element8 = "Oxygen";
        String element9 = "Fluorine";
        String element10 = "Neon";
        String element11 = "Sodium";
        String element12 = "Magnesium";
		
		
		
        String elements[] = {
			element1, element2, element3, element4,
			element5, element6, element7, element8,
			element9, element10, element11, element12
		};

        /*System.out.println("In PeriodicTable, the elements are:");
        System.out.println(elements[0] + ", " + elements[1] + ", " + elements[2] + ", " + elements[3] + ", " +
                           elements[4] + ", " + elements[5] + ", " + elements[6] + ", " + elements[7] + ", " +
                           elements[8] + ", " + elements[9] + ", " + elements[10] + ", " + elements[11]);*/
						   
						  for (String element : elements){
							  System.out.println(element);
						  }
    }
}
