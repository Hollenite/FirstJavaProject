import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("principal: ");
        int Principal = in.nextInt();
                System.out.print("Interest: ");
        double Interest = in.nextDouble();
                System.out.print("Period(years): ");
        int Age = in.nextInt();
        Interest /= 100;
        double numerator = Principal * (Interest/12) * Math.pow(((double)1 + (Interest/12)), (12 * Age));
        double denominator = (Math.pow((1 + (Interest/12)), (12 * Age))) - 1;
        double final_value = (numerator/denominator);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
            String var = currency.format(final_value);
        System.out.println(var);
        System.out.println("$" + final_value);
    }
}