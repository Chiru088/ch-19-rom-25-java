class Screen{


       boolean multiplex;
	   String modeOfScreen;
	   boolean isPvrInoxOverview;
	   
	   Movie movie;
	   
	   
	   void getScreenInfo(){
	   System.out.println("the screen multiplex is :" + multiplex);
	   System.out.println("the mode Of Screen is : " + modeOfScreen);
	   System.out.println("the isPvr Inox Overview is : " + isPvrInoxOverview);
	   
	   this.movie.getMovieInfo();
	   
	   
	   }


}