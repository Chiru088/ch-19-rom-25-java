public class UberEats {

    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Chicken Burger")
            price = 120.00;
        else if (foodName == "Cheese Pizza")
            price = 180.00;
        else if (foodName == "Veg Biryani")
            price = 140.00;
        else if (foodName == "Chicken Biryani")
            price = 200.00;
        else if (foodName == "Paneer Tikka")
            price = 160.00;
        else if (foodName == "Masala Dosa")
            price = 90.00;
        else if (foodName == "Veg Fried Rice")
            price = 110.00;
        else if (foodName == "Egg Fried Rice")
            price = 130.00;
        else if (foodName == "Chicken Fried Rice")
            price = 150.00;
        else if (foodName == "Manchurian Dry")
            price = 100.00;
        else if (foodName == "Chilli Chicken")
            price = 160.00;
        else if (foodName == "Spring Roll")
            price = 90.00;
        else if (foodName == "Aloo Tikki")
            price = 50.00;
        else if (foodName == "Momos Veg")
            price = 80.00;
        else if (foodName == "Momos Chicken")
            price = 100.00;
        else if (foodName == "Butter Naan")
            price = 35.00;
        else if (foodName == "Paneer Butter Masala")
            price = 170.00;
        else if (foodName == "Dal Makhani")
            price = 130.00;
        else if (foodName == "Tandoori Chicken")
            price = 250.00;
        else if (foodName == "Samosa")
            price = 40.00;
        else if (foodName == "Rajma Rice")
            price = 120.00;
        else if (foodName == "Pav Bhaji")
            price = 95.00;
        else if (foodName == "Kadhai Paneer")
            price = 165.00;
        else if (foodName == "Chole Bhature")
            price = 105.00;
        else if (foodName == "Fish Fry")
            price = 220.00;
        else if (foodName == "Egg Curry")
            price = 125.00;
        else if (foodName == "Hyderabadi Biryani")
            price = 210.00;
        else if (foodName == "Veg Thali")
            price = 160.00;
        else if (foodName == "Non-Veg Thali")
            price = 230.00;
        else
            System.out.println(foodName + " is not available on UberEats.");

        return price;
    }
}
