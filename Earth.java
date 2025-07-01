class Earth {
	
	/*static String region1 = "Asia";
	static String region2 = "Africa";
	static String region3 = "North America";
	static String region4 = "South America";
	static String region5 = "Antarctica";
	static String region6 = "Europe";
	static String region7 = "Australia";
	static String region8 = "Middle East";
	static String region9 = "Central America";
	static String region10 = "Arctic Region";*/
    public static void main(String[] args) {
		
		
	 String region1 = "Asia";
	 String region2 = "Africa";
	 String region3 = "North America";
	 String region4 = "South America";
	 String region5 = "Antarctica";
	 String region6 = "Europe";
	 String region7 = "Australia";
	 String region8 = "Middle East";
	 String region9 = "Central America";
	 String region10 = "Arctic Region";
        String continents[] = {
			region1, region2, region3, region4, region5,
			region6, region7, region8, region9, region10
		};

        System.out.println("On Earth, the continents and regions are:");
                              for (String continent : continents){
								   System.out.println(continent);
							   }
    }
}
