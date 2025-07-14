class Dominos {

    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Cheese Margherita") price = 189.00;
        else if (foodName == "Farmhouse Pizza") price = 299.00;
        else if (foodName == "Chicken Dominator") price = 399.00;
        else if (foodName == "Peppy Paneer") price = 349.00;
        else if (foodName == "Veg Extravaganza") price = 329.00;
        else if (foodName == "Indi Tandoori Paneer") price = 349.00;
        else if (foodName == "Deluxe Veggie") price = 299.00;
        else if (foodName == "Mexican Green Wave") price = 289.00;
        else if (foodName == "Cheese Burst") price = 199.00;
        else if (foodName == "Garlic Bread") price = 129.00;
        else if (foodName == "Stuffed Garlic Bread") price = 149.00;
        else if (foodName == "Choco Lava Cake") price = 109.00;
        else if (foodName == "Brownie Fantasy") price = 129.00;
        else if (foodName == "Veg Parcel") price = 59.00;
        else if (foodName == "Chicken Parcel") price = 69.00;
        else if (foodName == "Coke Can") price = 60.00;
        else if (foodName == "Pepsi") price = 50.00;
        else if (foodName == "Mirinda") price = 50.00;
        else if (foodName == "Cheesy Dip") price = 25.00;
        else if (foodName == "Tomato Dip") price = 20.00;
        else if (foodName == "Classic Margherita") price = 99.00;
        else if (foodName == "Onion Pizza") price = 119.00;
        else if (foodName == "Capsicum Pizza") price = 129.00;
        else if (foodName == "Paneer Makhani") price = 249.00;
        else if (foodName == "Pepper Barbecue Chicken") price = 279.00;
        else if (foodName == "Chicken Sausage") price = 259.00;
        else if (foodName == "Chicken Pepperoni") price = 349.00;
        else if (foodName == "Zingy Parcel Veg") price = 39.00;
        else if (foodName == "Taco Mexicana Veg") price = 99.00;
        else if (foodName == "Taco Mexicana Chicken") price = 119.00;
        else
            System.out.println(foodName + " is not available on Domino's.");

        return price;
    }
}
