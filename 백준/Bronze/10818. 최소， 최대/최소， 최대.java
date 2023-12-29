import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int MIN = 1000000000;
        int MAX = -1000000000;

        for (int i = 0; i < num; i++){
            int nums = input.nextInt();
            numList.add(nums);
        }

        for (int j = 0; j < num; j++){
            if (numList.get(j) < MIN){
                MIN = numList.get(j);
            }
            if (numList.get(j) > MAX){
                MAX = numList.get(j);
            }
        }

        System.out.println(MIN + " " + MAX);
    }
}