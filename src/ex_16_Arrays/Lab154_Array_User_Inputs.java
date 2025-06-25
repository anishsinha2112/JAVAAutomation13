package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size = sc.nextByte();

        int[] number_marks = new int[size];

        //  float[] number_marks = new float[size];
        // string[] number_marks = new String[size];

        for (int i = 0; i < number_marks.length ; i++) {
            System.out.println("Enter the numbers");
            number_marks[i] = sc.nextInt();
        }

        System.out.println(" ---- Below Code is printing the elements! ");

        for (int i = 0; i < number_marks.length ; i++) {
            System.out.println(number_marks[i]);
        }






    }
}