package arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];

        jaggedArray = new int[][]{
                {1, 2},
                {3, 4, 5, 6, 7},
                {8, 9, 10}
        };

        for (int[] elem: jaggedArray) {
            for (int childElem:elem) {
                System.out.print(childElem + " ");
            }
            System.out.println();
        }
    }
}
