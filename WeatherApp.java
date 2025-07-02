class WeatherApp {
    public static void main(String[] args) {
        showTemperature("Bangalore", 29);
    }

    public static void showTemperature(String city, int temp) {
        System.out.println("Current temperature in " + city + ": " + temp);
    }
}
