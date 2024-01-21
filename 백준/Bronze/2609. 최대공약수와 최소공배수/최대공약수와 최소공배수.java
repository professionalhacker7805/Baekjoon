import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    public static int gcd(int n, int m) { // 최소공배수
        while (m != 0) {
            int number = m;
            m = n % m;
            n = number;
        }
        return n;
    }

    public static int lcm(int n, int m) { // 최대공약수
        return n * m / gcd(n, m);
    }
}