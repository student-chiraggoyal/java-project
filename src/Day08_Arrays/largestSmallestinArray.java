package Day08_Arrays;

public class largestSmallestinArray {

    public static int largestSmallestnoArray(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
                largest = number[i];
            }
            if(number[i]<smallest){
                smallest = number[i];
            }
        }
        System.out.println("the smallest number is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("the largest number is: " + largestSmallestnoArray(number));
    }
}
