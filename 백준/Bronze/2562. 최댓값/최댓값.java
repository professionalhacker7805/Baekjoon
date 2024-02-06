import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        int MAX = 0;
        int count = 0;

        for (int i = 0; i < 9 ; i++) {
            int n = scanner.nextInt();
            numbers.add(String.valueOf(n));
            if (n > MAX) {
                MAX = n;
            }
        }

        for (String number : numbers){
            count += 1;

            if (String.valueOf(MAX).equals(number)){
                break;
            }
        }

        System.out.println(MAX);
        System.out.println(count);
    }
}
