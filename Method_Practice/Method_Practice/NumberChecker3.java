import java.util.Scanner;

public class NumberChecker3 {

    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));

        sc.close();
    }
}
