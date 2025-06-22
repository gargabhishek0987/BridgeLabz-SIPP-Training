import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Take 5 inputs
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.print("Positive ");
                if (isEven(nums[i])) {
                    System.out.println("and Even");
                } else {
                    System.out.println("and Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last element
        int result = compare(nums[0], nums[4]);
        System.out.print("\nFirst element (" + nums[0] + ") is ");
        if (result == 1) {
            System.out.println("greater than last element (" + nums[4] + ")");
        } else if (result == 0) {
            System.out.println("equal to last element (" + nums[4] + ")");
        } else {
            System.out.println("less than last element (" + nums[4] + ")");
        }

        sc.close();
    }
}
