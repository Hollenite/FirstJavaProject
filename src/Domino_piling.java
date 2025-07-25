import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int area = num1 * num2;
        System.out.println(area/2);
    }
}