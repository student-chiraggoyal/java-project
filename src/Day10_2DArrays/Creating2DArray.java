package Day10_2DArrays;

import java.util.Scanner;

public class Creating2DArray {

    //search an element of the matrix
    public static boolean searchElement(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==target){
                    System.out.println("Element found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {

        //initialize 2d array
        int matrix[][] = new int[3][3];
        //how to know the no of rows and no of columns
        int n =  matrix.length, m = matrix[0].length;

        //input the values of the elements of the matrix
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //print the elements of the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchElement(matrix,5);
    }
}
