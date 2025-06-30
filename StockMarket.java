class StockMarket {
    public static void main(String[] args) {
        String stockNames[] = {
            "TCS", "Infosys", "Reliance", "Wipro", "HDFC Bank",
            "ICICI Bank", "HUL", "Tata Motors", "Axis Bank", "ITC"
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
