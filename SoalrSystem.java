class SolarSystem{
    static int numberOfPlanets = 8;
    static String largestPlanet = "Jupiter";
    static String smallestPlanet = "Mercury";
    static String sunType = "G-type main-sequence star (G2V)";
    static String earthMoonName = "Moon";
    static double distanceEarthToSunKM = 149600000;

    public static void main(String[] args) {
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Sun Type: " + sunType);
        System.out.println("Earth's Moon: " + earthMoonName);
        System.out.println("Distance from Earth to Sun (km): " + distanceEarthToSunKM);
    }
}
