package Day08_Arrays;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int array[], int key){
        int start = 0;
        int end = array.length - 1 ;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==key)
                return mid;
            else if(array[mid]>key)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number you want to search: ");
        int number = input.nextInt();

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};

        int index = binarySearch(numbers, number);
        if(index==-1)
            System.out.println("number is not found");
        else
            System.out.println("number found at index: " + index);
    }
}
