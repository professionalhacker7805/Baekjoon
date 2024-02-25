import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[9][9];
        int MAX = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numbers[i][j] = scanner.nextInt();

                if (numbers[i][j] > MAX) {
                    MAX = numbers[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        scanner.close();
        System.out.println(MAX);
        System.out.printf("%d %d", x, y);
    }
}
