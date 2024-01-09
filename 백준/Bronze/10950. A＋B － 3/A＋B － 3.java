import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i < a + 1; i++){
            int n = input.nextInt();
            int m = input.nextInt();
            System.out.println(n+m);
        }
    }
}