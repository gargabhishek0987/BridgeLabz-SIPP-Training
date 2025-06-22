public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) 
               + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        double temperature = 10.0;
        double windSpeed = 20.0;

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill + "°F");
    }
}
