class PvrRunner{

public static void main (String cinema []){

         Movie movie  = new Movie();
		  String movieName="Kantara";
   String producerName="pragathi";
   String language="kannada";
   
   movie.movieName=movieName;
   movie.producerName=producerName;
   movie.language=language;
   
   
   
                   Screen screen  =  new Screen();
                     
       boolean multiplex=true;
	   String modeOfScreen = "4k";
	   boolean isPvrInoxOverview= true;

screen.multiplex=multiplex;
screen.movie=movie;
screen.modeOfScreen=modeOfScreen;
screen.isPvrInoxOverview=isPvrInoxOverview;


                   Pvr  pvr = new Pvr();
				
	                   String location="mall";
					   	   pvr.screen=screen;
	   pvr.getPvrInfo();


}





}