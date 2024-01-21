import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String a = input.next();
        String[] str = a.split("");

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(str[i]);
        }

        System.out.println(sum);
    }
}