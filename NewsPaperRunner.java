class NewsPaperRunner{



   public static void main(String paper []){
   
   
   System.out.println("main started");
   
   
   // static is a single per class-----> classa Name
   // instance Variable  content always refrence Variable name
   // classname anything = new classname --- syntax of object refrence
                  NewsPaper newsPaper = new NewsPaper();
                   newsPaper.newsPaperId =10;
				   newsPaper.noOfPages = 18;
				   newsPaper.langauage= "English";
				   newsPaper.date= "25-Dec-2025";
                   newsPaper.day="";
                   newsPaper.companyName="vijay karanatka";				   
				   
				   
				   System.out.println("the news Paper Id" + newsPaper.newsPaperId);
				   System.out.println("the news paper no of pages are "  +  newsPaper.noOfPages);
				   System.out.println("the news paper langauage is " +  newsPaper.langauage);
				   System.out.println("the news paper date is : " + newsPaper.date);
				   System.out.println("the news paper day is : " + newsPaper.day);
				   System.out.println("the news paper company Name is : " + newsPaper.companyName);
   
   
   
   
   
   
   
   
   
   
   
      System.out.println("main ended");
   
   
   
   
   
   
   
   
   
   
   
   
   }








}