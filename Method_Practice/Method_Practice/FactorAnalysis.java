import java.util.Scanner;

public class FactorAnalysis {

   
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[idx++] = i;

        return factors;
    }

        public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors)
            if (f > max) max = f;
        return max;
    }

    // 3. Find sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // 4. Find product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // 5. Product of cube of factors
    public static double cubeProductFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.printf("Product of cube of factors: %.2e\n", cubeProductFactors(factors));

        sc.close();
    }
}
