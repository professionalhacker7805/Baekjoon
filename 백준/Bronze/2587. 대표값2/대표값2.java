import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numberList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            sum += n;
            numberList.add(String.valueOf(n));
        }

        Collections.sort(numberList);

        System.out.println(sum/5);
        System.out.println(numberList.get(2));
    }
}
