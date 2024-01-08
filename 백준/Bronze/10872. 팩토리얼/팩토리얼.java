import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int f = 1;

        for (int i = 0; i < a; i ++) {
            f = f * (a - i);
        }

        System.out.println(f);
    }
}