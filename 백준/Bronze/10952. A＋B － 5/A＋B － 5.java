import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int n = input.nextInt();
            int m = input.nextInt();
            if (n == 0 && m == 0){
                break;
            }
            System.out.println(n+m);
        }
    }
}