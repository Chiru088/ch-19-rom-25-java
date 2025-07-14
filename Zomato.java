class Zomato {

    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Paneer Biryani")
		price = 160.00;
        else if (foodName == "Chicken Dum Biryani") 
		price = 210.00;
        else if (foodName == "Butter Chicken")
		price = 240.00;
        else if (foodName == "Dal Tadka")
		price = 130.00;
        else if (foodName == "Garlic Naan")
		price = 40.00;
        else if (foodName == "Tandoori Chicken") 
		price = 260.00;
        else if (foodName == "Idli Sambhar")
		price = 80.00;
        else if (foodName == "Aloo Tikki Burger")
		price = 90.00;
        else if (foodName == "Veg Pulao")
		price = 140.00;
        else if (foodName == "Fish Curry Rice") 
		price = 250.00;
        else if (foodName == "Chole Kulche")
		price = 120.00;
        else if (foodName == "Rajma Chawal") 
		price = 110.00;
        else if (foodName == "Paneer Tikka") 
		price = 150.00;
        else if (foodName == "Egg Curry")
		price = 130.00;
        else if (foodName == "Chilli Chicken")
		price = 170.00;
        else if (foodName == "Veg Fried Rice")
		price = 120.00;
        else if (foodName == "Gulab Jamun")
		price = 70.00;
        else if (foodName == "Ice Cream Sundae") 
		price = 90.00;
        else if (foodName == "Veg Thali")
		price = 180.00;
        else if (foodName == "Non-Veg Thali")
		price = 230.00;
        else if (foodName == "Hakka Noodles")
		price = 140.00;
        else if (foodName == "Schezwan Noodles") 
		price = 150.00;
        else if (foodName == "Pizza Margherita")
		price = 180.00;
        else if (foodName == "Veg Burger")
		price = 85.00;
        else if (foodName == "Chicken Nuggets") 
		price = 160.00;
        else if (foodName == "Mushroom Masala")
		price = 140.00;
        else if (foodName == "Malai Kofta") 
		price = 180.00;
        else if (foodName == "Aloo Paratha")
		price = 60.00;
        else if (foodName == "Bhature Chole")
		price = 100.00;
        else if (foodName == "Falooda") 
		price = 90.00;
        else
            System.out.println(foodName + " is not available on Zomato.");

        return price;
    }
}
