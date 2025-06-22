import java.util.Scanner;

public class TrigonometryCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[] {
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("sin: " + results[0]);
        System.out.println("cos: " + results[1]);
        System.out.println("tan: " + results[2]);

        sc.close();
    }
}
