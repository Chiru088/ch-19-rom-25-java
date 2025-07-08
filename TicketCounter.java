class TicketCounter{
    public static void issueTicket(String customerName, long phoneNumber, String movieName){
	System.out.println("Ticket processing");
	System.out.println("customer Name is :" +customerName);
	System.out.println("phone Number is :" +phoneNumber);
	System.out.println("movie Name is :" +movieName);
	
	
	Raghu.guide(customerName);

    System.out.println("Ticket issued succesfully");
}
}