class  LokasabhaRunner{




  public static void main (String Government []){
                  Politician   politician  =  new  Politician (); 
				        String politicianName="Tejasvi surya";
						String politicianElectedPlace="Bangalore";
	                    String politicianParty="BJP";
						politician.politicianName=politicianName;
						politician.politicianElectedPlace=politicianElectedPlace;
						politician.politicianParty=politicianParty;
						
						
		Seat	seat		=	new Seat();
		 seat.politician=politician;
		   int totalNumberOfSeats= 543;
		   seat.totalNumberOfSeats=totalNumberOfSeats;
		   
		  Lokasabha  lokasabha = new Lokasabha();
           lokasabha.seat=seat;
   String location="Delhi";
   int numberOfTerm= 5;
   int constitutedYear=1952;
   lokasabha.location=location;
   lokasabha.numberOfTerm=numberOfTerm;
   lokasabha.location=location;
   lokasabha.constitutedYear=constitutedYear;
   
   lokasabha. getLokasabhaData();
   
  
  
  }
}