package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_for_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        // 3x3
        //  R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) { // 0,1,2
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " | ");
            }
            System.out.println();
        }
    }

}