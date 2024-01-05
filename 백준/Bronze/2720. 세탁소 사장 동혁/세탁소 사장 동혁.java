import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int change = input.nextInt();
            int q = change / 25;
            change %= 25;
            int d = change / 10;
            change %= 10;
            int n = change / 5;
            change %= 5;
            int p = change;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        input.close();
    }
}