import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int index = input.nextInt();

        System.out.println(word.charAt(index-1));
        input.close();
    }
}