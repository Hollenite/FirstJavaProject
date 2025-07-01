import java.util.Scanner;
public class Main2 {
    public static void main (String[] args){
        int Cigar;
        String isWeekend;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Cigars");
        Cigar = input.nextInt();
        System.out.println("Is it a weekend?(y/n)");
        isWeekend = input.next();
        if (isWeekend.equals("y")) {
            if (Cigar >= 40) {
                System.out.println("PArty Success");
            } else {
                System.out.println("Party False");
            }
        } else {
            if (Cigar >= 40 && Cigar <= 60) {
                System.out.println("PArty Success");
            } else {
                System.out.println("Party False");
            }
        }
    }
}
