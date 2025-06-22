import java.util.*;

public class EmployeeBonus {

    public static double[][] generateData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // Salary: 10000 to 99999
            data[i][1] = (int)(Math.random() * 11); // Service years: 0 to 10
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayResults(double[][] original, double[][] updated) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        System.out.printf("%-5s %-10s %-8s %-10s %-10s\n", "ID", "OldSalary", "Years", "NewSalary", "Bonus");
        for (int i = 0; i < original.length; i++) {
            double oldSal = original[i][0];
            int yrs = (int) original[i][1];
            double newSal = updated[i][0];
            double bonus = updated[i][1];
            oldSum += oldSal;
            newSum += newSal;
            bonusSum += bonus;
            System.out.printf("%-5d %-10.0f %-8d %-10.0f %-10.0f\n", i + 1, oldSal, yrs, newSal, bonus);
        }
        System.out.println("\nTotal Old Salary: " + oldSum);
        System.out.println("Total New Salary: " + newSum);
        System.out.println("Total Bonus: " + bonusSum);
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] salaryService = generateData(n);
        double[][] newSalaryBonus = calculateBonus(salaryService);
        displayResults(salaryService, newSalaryBonus);
    }
}
