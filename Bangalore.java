class Bangalore {
	
	
	/*static String area1 = "Whitefield";
	static String area2 = "Indiranagar";*/
	
    public static void main(String[] args) {
		String area1 = "Whitefield";
        String area2 = "Indiranagar";
		
        String areaNames[] = { area1, area2 };


        /*System.out.println("In Bangalore, the areas are:");
        System.out.println(areaNames[0] + ", " + areaNames[1]);*/
		
		
	  for (String areaName	: areaNames){
		  System.out.println(areaName);
	  }
    }
