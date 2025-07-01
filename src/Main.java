import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
            int Principal;
            double Interest;
            int Age;
                do {
                    System.out.print("principal(between 1k and 1m: ");
                    Principal = in.nextInt();
                    if (Principal < 1000 || Principal > 10_00_000) {
                        System.out.println("Invalid Value, Please enter your value again");
                    }
                } while (Principal < 1000 || Principal > 10_00_000);
                do {
                    System.out.print("Interest(between 0 and 30): ");
                    Interest = in.nextDouble();
                    if (Interest < 0 || Interest > 30) {
                        System.out.println("Invalid Value, Please enter your value again");
                    }
                } while (Interest < 0 || Interest > 30);
                do {
                    System.out.print("Period(years between 1 and 30): ");
                    Age = in.nextInt();
                    if (Age < 1 || Age > 30) {
                        System.out.println("Invalid Value, Please enter your value again");
                    }
                } while (Age < 1 || Age > 30);

        Interest /= 100;
        double numerator = Principal * (Interest/12) * Math.pow(((double)1 + (Interest/12)), (12 * Age));
        double denominator = (Math.pow((1 + (Interest/12)), (12 * Age))) - 1;
        double final_value = (numerator/denominator);
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//            String var = currency.format(final_value);
//        System.out.println(var);
        System.out.println("$" + final_value);
    }
}
//public class Main{
//    public static void main(String [] args) {
//    int i;
//    for (i = 0; i < 5; i++) {
//        if (i >= 3) {
//            break;
//        }
//        System.out.println("Yuhu");
//        if (i >= 1) {
//            continue;
//        }
//        System.out.println("Tata");
//    }
//    System.out.println(i);
//}
//    }
//
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String [] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter your number:");
//        int number = in.nextInt();
//        if (number % 15 == 0){
//            System.out.println("Fizzbuzz");
//        } else if (number % 5 == 0) {
//            System.out.println("fizz");
//        } else if (number % 3 == 0) {
//            System.out.println("buzz");
//        }  else {
//                System.out.println(number);
//            }
//        }
//    }
//
//public class Main{
//    public static void main(String [] args) {
//
//    }
//}

