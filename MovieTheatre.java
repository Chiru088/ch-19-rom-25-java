class MovieTheatre{

    public static void book(String customerName, long phoneNumber, String movieName){
	System.out.println("started booking ticket");
	
	
	TicketCounter.issueTicket(customerName, phoneNumber, movieName);
	System.out.println("booking complted");
	
	
	}

}