package main;

public class Even_Digit_counter {
    public static void main(String[] args) {
        int[] nums = {132, 234234, 323, 42, 8, 6324, 542424};
        int[][] test = new int[nums.length][1];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            test[i][0] = nums[i];
        }
        for (int[] arr : test) {
            for (int value : arr) {
                int digit = 0;
                while (value > 0) {
                    value /= 10;
                    digit += 1;
                } if (digit % 2 == 0) {
                    count += 1;
                }

            }
        }
        System.out.println(count);
    }
}




