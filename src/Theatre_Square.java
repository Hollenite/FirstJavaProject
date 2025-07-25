import java.util.Scanner;
public class Theatre_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        double a = scanner.nextDouble();
        double value = Math.ceil((m/a)) * Math.ceil((n/a));
        System.out.println((int)value);
    }
}
