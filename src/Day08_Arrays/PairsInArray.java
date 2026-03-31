package Day08_Arrays;

public class PairsInArray {

    public static void Pairs(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("(" + array[i] + "," + array[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        Pairs(array);

        int n = array.length;
        System.out.println("The total no of pairs of the given array are: " + (n*(n-1))/2);
    }
}
