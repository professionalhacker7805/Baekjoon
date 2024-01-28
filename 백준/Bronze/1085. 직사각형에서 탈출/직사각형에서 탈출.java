import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
//        int min = 10000;
//
//        if (x < Math.abs(w - x) && x < min) {
//            min = x;
//        } else if (x > Math.abs(w - x) && Math.abs(w - x) < min) {
//            min = Math.abs(w - x);
//        } else {
//            min = x;
//        }
//        if (y < Math.abs(h - y) && y < min) {
//            min = y;
//        } else if(y > Math.abs(h - y) && Math.abs(h - y) < min){
//            min = Math.abs(h - y);
//        } else {
//            min = y;
//        }
//
//        System.out.println(Math.abs(min));
        int min = Integer.MAX_VALUE;
        if (x < min) {
            min = x;
        }
        if (w - x < min) {
            min = w - x;
        }
        if (y < min) {
            min = y;
        }
        if (h - y < min) {
            min = h - y;
        }

        System.out.println(min);
    }
}
