class StockMarket {
	/*static String stock1 = "TCS";
	static String stock2 = "Infosys";
	static String stock3 = "Reliance";
	static String stock4 = "Wipro";
	static String stock5 = "HDFC Bank";
	static String stock6 = "ICICI Bank";
	static String stock7 = "HUL";
	static String stock8 = "Tata Motors";
	static String stock9 = "Axis Bank";
	static String stock10 = "ITC";*/
	
    public static void main(String[] args) {
		
		
		String stock1 = "TCS";
        String stock2 = "Infosys";
        String stock3 = "Reliance";
        String stock4 = "Wipro";
        String stock5 = "HDFC Bank";
        String stock6 = "ICICI Bank";
        String stock7 = "HUL";
        String stock8 = "Tata Motors";
        String stock9 = "Axis Bank";
        String stock10 = "ITC";
		
        String stockNames[] = {
			stock1, stock2, stock3, stock4, stock5,
			stock6, stock7, stock8, stock9, stock10
		};

        /*System.out.println("In StockMarket, the stocks are:");
        System.out.println(stockNames[0] + ", " + stockNames[1] + ", " + stockNames[2] + ", " + stockNames[3] + ", " +
                           stockNames[4] + ", " + stockNames[5] + ", " + stockNames[6] + ", " + stockNames[7] + ", " +
                           stockNames[8] + ", " + stockNames[9]);*/
						   
						   
						  for (String stockName : stockNames){
							  System.out.println(stockName);
						  }
    }
}
