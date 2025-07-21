class BillRunner{

public static void main (String [] payment){

         Bill ref = new Bill();
		 
		 
		 ref.billId = 1;
		 ref.billAmountWithTax = 500.00;
		 ref.planType = "Montly Plan";
		 ref.billDueDate = "30 december";
		 ref.isbillPaid = true;
		 ref.paymentMethod = "online";
		 
		 System.out.println("the first bill id is : " + ref.billId);
		 System.out.println("the  first billAmount With Tax is " + ref.billAmountWithTax);
		 System.out.println("the first planType is " + ref.planType);
		 System.out.println("the first billDue Date is " + ref.billDueDate);
		 System.out.println("the first isbillPaid is " + ref.isbillPaid);
         System.out.println("the first paymentMethod is " + ref.paymentMethod);
		 
		 
	Bill ref2 = new Bill();
	
        ref2.billId = 2;
        ref2.billAmountWithTax = 1200.50;
        ref2.planType = "Quarterly Plan";
        ref2.billDueDate = "15 January";
        ref2.isbillPaid = false;
        ref2.paymentMethod = "Cash";


		 System.out.println("the second bill id is : " + ref2.billId);
		 System.out.println("the  second billAmount With Tax is " + ref2.billAmountWithTax);
		 System.out.println("the second planType is " + ref2.planType);
		 System.out.println("the second billDue Date is " + ref2.billDueDate);
		 System.out.println("the second isbillPaid is " + ref2.isbillPaid);
         System.out.println("the second paymentMethod is " + ref2.paymentMethod);
		 
		 Bill ref3 = new Bill();
        ref3.billId = 3;
        ref3.billAmountWithTax = 750.75;
        ref3.planType = "Yearly Plan";
        ref3.billDueDate = "28 February";
        ref3.isbillPaid = true;
        ref3.paymentMethod = "UPI";
		
		
		 System.out.println("the Third bill id is : " + ref3.billId);
		 System.out.println("the  Third billAmount With Tax is " + ref3.billAmountWithTax);
		 System.out.println("the Third planType is " + ref3.planType);
		 System.out.println("the ThirdbillDue Date is " + ref3.billDueDate);
		 System.out.println("the Third isbillPaid is " + ref3.isbillPaid);
         System.out.println("the Third paymentMethod is " + ref3.paymentMethod);
		 
		 
    Bill ref4 = new Bill();
        ref4.billId = 4;
        ref4.billAmountWithTax = 980.00;
        ref4.planType = "Monthly Plan";
        ref4.billDueDate = "05 March";
        ref4.isbillPaid = false;
        ref4.paymentMethod = "Credit Card";
		
		System.out.println("the Fourth bill id is : " + ref4.billId);
        System.out.println("the Fourth billAmount With Tax is " + ref4.billAmountWithTax);
        System.out.println("the Fourth planType is " + ref4.planType);
        System.out.println("the Fourth billDue Date is " + ref4.billDueDate);
        System.out.println("the Fourth isbillPaid is " + ref4.isbillPaid);
        System.out.println("the Fourth paymentMethod is " + ref4.paymentMethod);
		
		
  Bill ref5 = new Bill();
        ref5.billId = 5;
        ref5.billAmountWithTax = 1333.30;
        ref5.planType = "Half-Yearly";
        ref5.billDueDate = "01 April";
        ref5.isbillPaid = true;
        ref5.paymentMethod = "Debit Card";
		    System.out.println("the Fifth bill id is : " + ref5.billId);
        System.out.println("the Fifth billAmount With Tax is " + ref5.billAmountWithTax);
        System.out.println("the Fifth planType is " + ref5.planType);
        System.out.println("the Fifth billDue Date is " + ref5.billDueDate);
        System.out.println("the Fifth isbillPaid is " + ref5.isbillPaid);
        System.out.println("the Fifth paymentMethod is " + ref5.paymentMethod);
		
		
		Bill ref6 = new Bill();
        ref6.billId = 6;
        ref6.billAmountWithTax = 440.00;
        ref6.planType = "Monthly";
        ref6.billDueDate = "15 April";
        ref6.isbillPaid = true;
        ref6.paymentMethod = "Net Banking";
		
		System.out.println("the sixth bill id is : " + ref6.billId);
        System.out.println("the sixth billAmount With Tax is " + ref6.billAmountWithTax);
        System.out.println("the sixth planType is " + ref6.planType);
        System.out.println("the sixth billDue Date is " + ref6.billDueDate);
        System.out.println("the sixth isbillPaid is " + ref6.isbillPaid);
        System.out.println("the sixth paymentMethod is " + ref6.paymentMethod);
		
		
		  Bill ref7 = new Bill();
        ref7.billId = 7;
        ref7.billAmountWithTax = 999.99;
        ref7.planType = "Annual";
        ref7.billDueDate = "10 May";
        ref7.isbillPaid = false;
        ref7.paymentMethod = "Cheque";
		
			System.out.println("the seventh bill id is : " + ref7.billId);
        System.out.println("the seventh billAmount With Tax is " + ref7.billAmountWithTax);
        System.out.println("the seventh planType is " + ref7.planType);
        System.out.println("the seventh billDue Date is " + ref7.billDueDate);
        System.out.println("the seventh isbillPaid is " + ref7.isbillPaid);
        System.out.println("the seventh paymentMethod is " + ref7.paymentMethod);
		


 Bill ref8 = new Bill();
        ref8.billId = 8;
        ref8.billAmountWithTax = 599.95;
        ref8.planType = "Monthly";
        ref8.billDueDate = "18 May";
        ref8.isbillPaid = true;
        ref8.paymentMethod = "Paytm";
		
		
			System.out.println("the eigth bill id is : " + ref8.billId);
        System.out.println("the eigth billAmount With Tax is " + ref8.billAmountWithTax);
        System.out.println("the eigth planType is " + ref8.planType);
        System.out.println("the eigth billDue Date is " + ref8.billDueDate);
        System.out.println("the eigth isbillPaid is " + ref8.isbillPaid);
        System.out.println("the eigth paymentMethod is " + ref8.paymentMethod);
		

           Bill ref9 = new Bill();
        ref9.billId = 9;
        ref9.billAmountWithTax = 1500.00;
        ref9.planType = "Bi-Monthly";
        ref9.billDueDate = "30 May";
        ref9.isbillPaid = true;
        ref9.paymentMethod = "PhonePe";
		
		System.out.println("the ninth bill id is : " + ref9.billId);
        System.out.println("the  ninth  billAmount With Tax is " + ref9.billAmountWithTax);
        System.out.println("the  ninth  planType is " + ref9.planType);
        System.out.println("the  ninth  billDue Date is " + ref9.billDueDate);
        System.out.println("the  ninth  isbillPaid is " + ref9.isbillPaid);
        System.out.println("the  ninth  paymentMethod is " + ref9.paymentMethod);

        Bill ref10 = new Bill();
        ref10.billId = 10;
        ref10.billAmountWithTax = 200.00;
        ref10.planType = "Weekly";
        ref10.billDueDate = "01 June";
        ref10.isbillPaid = false;
        ref10.paymentMethod = "Cash";
		
				
		System.out.println("the tenth bill id is : " + ref10.billId);
        System.out.println("the  tenth  billAmount With Tax is " + ref10.billAmountWithTax);
        System.out.println("the  tenth  planType is " + ref10.planType);
        System.out.println("the  tenth billDue Date is " + ref10.billDueDate);
        System.out.println("the tenth  isbillPaid is " + ref10.isbillPaid);
        System.out.println("the tenth paymentMethod is " + ref10.paymentMethod);


        Bill ref11 = new Bill();
        ref11.billId = 11;
        ref11.billAmountWithTax = 800.00;
        ref11.planType = "Monthly";
        ref11.billDueDate = "10 June";
        ref11.isbillPaid = true;
        ref11.paymentMethod = "UPI";
		
		
		System.out.println("the eleventh bill id is : " + ref11.billId);
        System.out.println("the  eleventh  billAmount With Tax is " + ref11.billAmountWithTax);
        System.out.println("the  eleventh  planType is " + ref11.planType);
        System.out.println("the  eleventh billDue Date is " + ref11.billDueDate);
        System.out.println("the eleventh isbillPaid is " + ref11.isbillPaid);
        System.out.println("the  eleventh paymentMethod is " + ref11.paymentMethod);

        Bill ref12 = new Bill();
        ref12.billId = 12;
        ref12.billAmountWithTax = 670.00;
        ref12.planType = "Quarterly";
        ref12.billDueDate = "20 June";
        ref12.isbillPaid = false;
        ref12.paymentMethod = "Online";
		
		
		System.out.println("the tevleth bill id is : " + ref12.billId);
        System.out.println("the  tevleth  billAmount With Tax is " + ref12.billAmountWithTax);
        System.out.println("the tevleth  planType is " + ref12.planType);
        System.out.println("the  tevleth billDue Date is " + ref12.billDueDate);
        System.out.println("the tevleth  isbillPaid is " + ref12.isbillPaid);
        System.out.println("the tevleth paymentMethod is " + ref12.paymentMethod);

        Bill ref13 = new Bill();
        ref13.billId = 13;
        ref13.billAmountWithTax = 1470.00;
        ref13.planType = "Annual";
        ref13.billDueDate = "30 June";
        ref13.isbillPaid = true;
        ref13.paymentMethod = "Net Banking";
		
		
   System.out.println("the thirtyth bill id is : " + ref13.billId);
        System.out.println(" the thirtyth   billAmount With Tax is " + ref13.billAmountWithTax);
        System.out.println("the  thirtyth   planType is " + ref13.planType);
        System.out.println("the thirtyth  billDue Date is " + ref13.billDueDate);
        System.out.println("the thirtyth  isbillPaid is " + ref13.isbillPaid);
        System.out.println("the thirtyth paymentMethod is " + ref13.paymentMethod);

        Bill ref14 = new Bill();
        ref14.billId = 14;
        ref14.billAmountWithTax = 899.90;
        ref14.planType = "Half-Yearly";
        ref14.billDueDate = "05 July";
        ref14.isbillPaid = false;
        ref14.paymentMethod = "Debit Card";
		
		
		System.out.println("the Fourthyth bill id is : " + ref14.billId);
        System.out.println("the  Fourthyth  billAmount With Tax is " + ref14.billAmountWithTax);
        System.out.println("the  Fourthyth  planType is " + ref14.planType);
        System.out.println("the  Fourthyth billDue Date is " + ref14.billDueDate);
        System.out.println("the Fourthyth    isbillPaid is " + ref14.isbillPaid);
        System.out.println("theFourthyth  paymentMethod is " + ref14.paymentMethod);

        Bill ref15 = new Bill();
        ref15.billId = 15;
        ref15.billAmountWithTax = 1000.00;
        ref15.planType = "Monthly";
        ref15.billDueDate = "12 July";
        ref15.isbillPaid = true;
        ref15.paymentMethod = "Credit Card";
		
		System.out.println("the Fiftynth bill id is : " + ref15.billId);
        System.out.println("the  Fiftynth  billAmount With Tax is " + ref15.billAmountWithTax);
        System.out.println("the  Fiftynth planType is " + ref15.planType);
        System.out.println("the  Fiftynth billDue Date is " + ref15.billDueDate);
        System.out.println("the Fiftynth isbillPaid is " + ref15.isbillPaid);
        System.out.println("the Fiftynth paymentMethod is " + ref15.paymentMethod);
		
		
		
		
		 
		 
		 
		 




}


}