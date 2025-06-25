package ex_16_Arrays;
import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
        // You find it without using the sort function.

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > first) {
                // Update all
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("First Largest: " + first);
        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);
    }
}

