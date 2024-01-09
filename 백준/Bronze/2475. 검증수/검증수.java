import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Math.pow(input.nextDouble(), 2);
        double b = Math.pow(input.nextDouble(), 2);
        double c = Math.pow(input.nextDouble(), 2);
        double d = Math.pow(input.nextDouble(), 2);
        double e = Math.pow(input.nextDouble(), 2);

        System.out.println((int) (a + b + c + d + e) % 10);
    }
}