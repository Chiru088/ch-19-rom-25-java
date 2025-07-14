class Dunzo {

    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Poha") price = 50.00;
        else if (foodName == "Upma") price = 55.00;
        else if (foodName == "Vada Pav") price = 35.00;
        else if (foodName == "Kanda Bhaji") price = 45.00;
        else if (foodName == "Misal Pav") price = 70.00;
        else if (foodName == "Chicken Roll") price = 120.00;
        else if (foodName == "Egg Roll") price = 100.00;
        else if (foodName == "Paneer Wrap") price = 130.00;
        else if (foodName == "Pav Bhaji") price = 95.00;
        else if (foodName == "Cheese Sandwich") price = 85.00;
        else if (foodName == "Fruit Salad") price = 70.00;
        else if (foodName == "Veg Pasta") price = 140.00;
        else if (foodName == "Chicken Pasta") price = 180.00;
        else if (foodName == "Lemon Juice") price = 40.00;
        else if (foodName == "Cold Coffee") price = 80.00;
        else if (foodName == "Veg Frankie") price = 100.00;
        else if (foodName == "Chicken Frankie") price = 140.00;
        else if (foodName == "Paneer Frankie") price = 120.00;
        else if (foodName == "Idli Vada") price = 60.00;
        else if (foodName == "Masala Dosa") price = 90.00;
        else if (foodName == "Set Dosa") price = 85.00;
        else if (foodName == "Kesari Bath") price = 55.00;
        else if (foodName == "Bisi Bele Bath") price = 70.00;
        else if (foodName == "Curd Rice") price = 60.00;
        else if (foodName == "Mango Juice") price = 50.00;
        else if (foodName == "Ice Cream Cup") price = 65.00;
        else if (foodName == "Oreo Shake") price = 90.00;
        else if (foodName == "Samosa") price = 30.00;
        else if (foodName == "Chaat Plate") price = 75.00;
        else if (foodName == "Milkshake") price = 95.00;
        else
            System.out.println(foodName + " is not available on Dunzo.");

        return price;
    }
}
