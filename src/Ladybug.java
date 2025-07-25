import java.util.Arrays;
import java.util.Scanner;

public class Ladybug {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String a = scanner.next();
//        String b = scanner.next();
//        String[] numbers_a = a.split("");
//        String[] numbers_b = b.split("");

//        for (int i = 0; i < n; i++) {
////            System.out.println(Arrays.toString(numbers_a));
////            System.out.println(Arrays.toString(numbers_b));
//            if (i == 0) {
//                if (numbers_a[i].equals("1")) {
//                    if (numbers_b[i + 1].equals("0")) {
//                        numbers_a[i] = "0";
//                        numbers_b[i + 1] = "1";
//                    }
//                }
//            } else {
//                if (i != n-1) {
//                    if ((numbers_a[i].equals("1"))) {
//                        if (numbers_b[i - 1].equals("0")) {
//                            numbers_a[i] = "0";
//                            numbers_b[i - 1] = "1";
//                        } else if (numbers_b[i + 1].equals("0")) {
//                            numbers_a[i] = "0";
//                            numbers_b[i + 1] = "1";
//                        } else if (numbers_b[i - 1].equals("1") && numbers_a[i - 2].equals("0")) {
//                            numbers_a[i - 2] = "1";
//                            numbers_b[i - 1] = "0";
//                        }
//                    }
//                }else if (i == n-1){
//                    if (numbers_a[i].equals("1")) {
//                        if (numbers_b[i - 1].equals("0")) {
//                            numbers_a[i] = "0";
//                            numbers_b[i - 1] = "1";
//                        }
//                    }
//                }
//
//            }
//        }
//        boolean allMatch = true;
//
//        for (int p = 0; p < n; p++) {
//            if (!numbers_a[p].equals("0")) {
//                allMatch = false;
//                break; // Exit loop early if any mismatch is found
//            }
//        }
//        System.out.println(Arrays.toString(numbers_a));
//        System.out.println(Arrays.toString(numbers_b));
//        if (allMatch) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        for (int i =0; i <= n; i += 2) {
//            numbers_a[i] = numbers_b[i+1];
//        }
//        for (int i =1; i <= n; i += 2) {
//            numbers_b[i] = numbers_a[i-1];
//        }
//        System.out.println(Arrays.toString(numbers_a));
//        System.out.println(Arrays.toString(numbers_b));
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int p = 0; p <= t; p++) {
            {
                int n = in.nextInt();
                String a = in.next();
                String b = in.next();

                StringBuilder newa = new StringBuilder();
                StringBuilder newb = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        newa.append(a.charAt(i));
                        newb.append(b.charAt(i));
                    } else {
                        newa.append(b.charAt(i));
                        newb.append(a.charAt(i));
                    }
                }

//                System.out.println("Original a:  " + a);
//                System.out.println("Original b:  " + b);
//                System.out.println("Reformatted newa: " + newa.toString());
//                System.out.println("Reformatted newb: " + newb.toString());

                String new_a = newa.toString();
                String new_b = newb.toString();
                double a0 = 0;
                double b0 = 0;

                for (int i = 0; i < n; i++) {
                    if (new_a.charAt(i) == '0') {
                        a0++;
                    }
                    if (new_b.charAt(i) == '0') {
                        b0++;
                    }
                }
            if (a0 >= (n / 2.0) && b0 >= (n / 2.0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            }
        }
    }
}

