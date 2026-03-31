package Day10_2DArrays;

public class PracticeQues {

    //count no of 7's
    public static int count7(int arr[][], int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    //sum of second row
    public static int sumof2row(int arr2[][]){
        int sum = 0;
        for(int j=0; j<arr2[0].length; j++){
            sum+=arr2[1][j];
        }
        return sum;
    }

    public static void printarr(int arr2[][]){
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    //transpose of matrix
    public static void transpose(int arr2[][]){
        int row = arr2.length,  col = arr2[0].length;
        int trans[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trans[j][i] = arr2[i][j];
            }
        }
        System.out.println("original matrix: ");
        printarr(arr2);
        System.out.println("transposed matrix: ");
        printarr(trans);
    }

    public static void main(String[] args) {
        int arr[][] = {{4, 7, 8},
                {8, 7, 7}};
        int target = 7;
//        System.out.println(count7(arr, target));

        int arr2[][] = {{2, 3, 4},
                {11, 14, 7},
                {21, 34, 6}};
//        System.out.println(sumof2row(arr2));

        transpose(arr2);
    }
}
