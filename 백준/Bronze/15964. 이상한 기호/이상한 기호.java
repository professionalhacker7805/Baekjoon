import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        long b = input.nextInt();

        System.out.println((a + b) * (a - b));
    }
}