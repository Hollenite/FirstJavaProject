import java.util.Arrays;
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        byte w;
//        w = scanner.nextByte();
//        if (w % 2 == 0 && w != 2){
//            System.out.println("YES");
//        } else
//            System.out.println("NO");
//        int n = scanner.nextInt();
//        String a = scanner.next();
        String b = scanner.next();
//        String[] numbers_a = a.split("");
        String[] numbers_b = b.split("");
        System.out.println(Arrays.toString(numbers_b));


//        else if (i == n - 1) {
//            if (numbers_a[i].equals("1")) {
//                if (numbers_b[i - 1].equals("0")) {
//                    numbers_a[i] = "0";
//                    numbers_b[i - 1] = "1";
//                }
//            }
//        }

//        else if (numbers_b[i - 1].equals("1") && numbers_a[i - 2].equals("0")) {
//            numbers_a[i - 2] = "1";
//            numbers_b[i - 1] = "0";
//        }
    }
}