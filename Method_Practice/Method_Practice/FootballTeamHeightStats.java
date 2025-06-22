import java.util.Random;

public class FootballTeamHeightStats {

    // Generate random heights for 11 players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250 cm
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Player Heights (in cm): ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height : " + findTallest(heights) + " cm");
        System.out.printf("Mean Height    : %.2f cm\n", meanHeight(heights));
    }
}
