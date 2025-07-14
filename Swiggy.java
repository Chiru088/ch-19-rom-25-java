class Swiggy {

    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Burger")
            price = 78.00;
        else if (foodName == "Pizza")
            price = 99.00;
        else if (foodName == "Paneer Butter Masala")
            price = 160.00;
        else if (foodName == "Chicken Biryani")
            price = 200.00;
        else if (foodName == "Veg Biryani")
            price = 140.00;
        else if (foodName == "Masala Dosa")
            price = 90.00;
        else if (foodName == "Idli Vada Combo")
            price = 70.00;
        else if (foodName == "Butter Naan")
            price = 30.00;
        else if (foodName == "Chicken Tikka")
            price = 220.00;
        else if (foodName == "Mutton Rogan Josh")
            price = 280.00;
        else if (foodName == "Chole Bhature")
            price = 100.00;
        else if (foodName == "Rajma Chawal")
            price = 120.00;
        else if (foodName == "Pav Bhaji")
            price = 90.00;
        else if (foodName == "Aloo Paratha")
            price = 60.00;
        else if (foodName == "Veg Pulao")
            price = 130.00;
        else if (foodName == "Chicken 65")
            price = 180.00;
        else if (foodName == "Gobi Manchurian")
            price = 110.00;
        else if (foodName == "Hakka Noodles Veg")
            price = 120.00;
        else if (foodName == "Hakka Noodles Chicken")
            price = 150.00;
        else if (foodName == "Fried Rice Veg")
            price = 110.00;
        else if (foodName == "Fried Rice Egg")
            price = 130.00;
        else if (foodName == "Fried Rice Chicken")
            price = 150.00;
        else if (foodName == "Schezwan Fried Rice")
            price = 140.00;
        else if (foodName == "Spring Roll")
            price = 80.00;
        else if (foodName == "Momos Veg")
            price = 70.00;
        else if (foodName == "Momos Chicken")
            price = 90.00;
        else if (foodName == "Egg Curry")
            price = 120.00;
        else if (foodName == "Chicken Curry")
            price = 180.00;
        else if (foodName == "Fish Curry")
            price = 220.00;
        else if (foodName == "Butter Chicken")
            price = 240.00;
        else if (foodName == "Hyderabadi Biryani")
            price = 220.00;
        else if (foodName == "Tandoori Chicken Half")
            price = 210.00;
        else if (foodName == "Tandoori Chicken Full")
            price = 390.00;
        else if (foodName == "Samosa")
            price = 40.00;
        else if (foodName == "Kachori Aloo Sabzi")
            price = 60.00;
        else if (foodName == "Bhindi Fry")
            price = 100.00;
        else if (foodName == "Palak Paneer")
            price = 160.00;
        else if (foodName == "Mix Veg Curry")
            price = 140.00;
        else if (foodName == "Dahi Bhalla")
            price = 80.00;
        else if (foodName == "Dhokla")
            price = 70.00;
        else if (foodName == "Sev Puri")
            price = 60.00;
        else if (foodName == "Pani Puri")
            price = 40.00;
        else if (foodName == "Veg Thali")
            price = 160.00;
        else if (foodName == "Non-Veg Thali")
            price = 220.00;
        else if (foodName == "Chilli Paneer")
            price = 130.00;
        else if (foodName == "Chilli Chicken")
            price = 160.00;
        else if (foodName == "Kadhai Paneer")
            price = 170.00;
        else if (foodName == "Malai Kofta")
            price = 180.00;
        else if (foodName == "Cheese Pizza Regular")
            price = 170.00;
        else
            System.out.println(foodName + " is not available on Swiggy.");

        return price;
    }
}
