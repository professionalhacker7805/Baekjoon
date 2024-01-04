import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println((int) Math.pow(Math.pow(2, (num)) + 1, 2));
    }
}