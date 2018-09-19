/*
source: https://www.hackerrank.com/challenges/2d-array/problem?h_r=next-challenge&h_v=zen
*/




import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[matrix.length - 1].length; j++) {
                int num = (int)(Math.random() * 10);
                matrix[i][j] = num;
                System.out.print(num + "\t");
            }
            System.out.println(" ");
        }
            System.out.println("This is a O(n*k) algorithm, and since it is 6 * 6 it is O(n^2)");
            System.out.println("Maximum sum of an hour glass " + hourGlass(matrix));

            System.out.println(Math.max(Math.abs(-6),Math.abs(0)));
    }

    public static int hourGlass(int[][] array) {

        int temp;
        //Use min value to make sure you are comparing it to higher values
        int max = Integer.MIN_VALUE;

        //Loop in each row 4 times
        for (int i = 0 ; i < 4 ; i++) {
            // Loop 4 times for each column
            for ( int j = 0 ; j < 4 ; j++) {
                temp =  array[i][j] + array[i][j+1]   + array[i][j + 2] +
                        array[i+1][j+1] +
                        array[i+2][j]+array[i+2][j+1] + array[i+2][j+2];
                max = Math.max(temp,max);
            }
        }
        
        //To return
        return max;

    }

    public static void print(String str){
        System.out.println(str + "\n");
    }
}



