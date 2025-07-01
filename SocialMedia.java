class SocialMedia {

    /*static String media1 = "Facebook";
    static String media2 = "Instagram";
    static String media3 = "Twitter";
    static String media4 = "Snapchat";
    static String media5 = "WhatsApp";
    static String media6 = "YouTube";
    static String media7 = "Telegram";
    static String media8 = "LinkedIn";
    static String media9 = "Reddit";
    static String media10 = "Pinterest";*/

    public static void main(String[] args) {
        System.out.println("In SocialMedia, the popular platforms are:");
        String media1 = "Facebook";
        String media2 = "Instagram";
        String media3 = "Twitter";
        String media4 = "Snapchat";
        String media5 = "WhatsApp";
        String media6 = "YouTube";
        String media7 = "Telegram";
        String media8 = "LinkedIn";
        String media9 = "Reddit";
        String media10 = "Pinterest";
		
        String mediaNames[] = {
            media1, media2, media3, media4, media5,
            media6, media7, media8, media9, media10
        };

        for (String mediaName : mediaNames) {
            System.out.println(mediaName);
        }
    }
}
