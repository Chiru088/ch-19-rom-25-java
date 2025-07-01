class Chatshop {
	
	
	
	/*static String chat1 = "Pani Puri";
	static String chat2 = "Masala Puri";
	static String chat3 = "Sev Puri";
	static String chat4 = "Bhel Puri";
	static String chat5 = "Dahi Puri";
	static String chat6 = "Samosa Chat";
	static String chat7 = "Kachori Chat";
	static String chat8 = "Aloo Tikki";
	static String chat9 = "Cutlet Chat";
	static String chat10 = "Raj Kachori";*/
	
	
    public static void main(String[] args) {
		
		
		String chat1 = "Pani Puri";
        String chat2 = "Masala Puri";
        String chat3 = "Sev Puri";
        String chat4 = "Bhel Puri";
        String chat5 = "Dahi Puri";
        String chat6 = "Samosa Chat";
        String chat7 = "Kachori Chat";
        String chat8 = "Aloo Tikki";
        String chat9 = "Cutlet Chat";
        String chat10 = "Raj Kachori";
        String chats[] = {
			chat1, chat2, chat3, chat4, chat5,
			chat6, chat7, chat8, chat9, chat10
		};

        /*System.out.println("In ChatShop, the available chats are:");
        System.out.println(chats[0] + ", " + chats[1] + ", " + chats[2] + ", " + chats[3] + ", " +
                           chats[4] + ", " + chats[5] + ", " + chats[6] + ", " + chats[7] + ", " +
                           chats[8] + ", " + chats[9]);*/
						   
						  for (String chat : chats){
							  System.out.println(chat);
						  }
    }
}
