package Day08_Arrays;

import java.util.Arrays;

public class ReverseArray {

    //normal method but not the best because space complexity is O(n) here....
    public static int[] reverse(int givenArray[]){
        int newArray[] = new int[givenArray.length];
        for(int i=0; i<newArray.length; i++){
            newArray[i] = givenArray[givenArray.length-1-i];
        }
        return newArray;
    }

    //best method because here time complexity is O(1).....
    public static void reverse2(int givenArray[]){
        int start = 0, end = givenArray.length-1;
        while(start < end){
         int temp = givenArray[start];
         givenArray[start] = givenArray[end];
         givenArray[end] = temp;
         start++;
         end--;
        }
    }

    public static void main(String[] args) {
        int givenArray[] = {12, 14, 8, 7, 5};
        System.out.println("this is the given array: " + Arrays.toString(givenArray));

//        int revArray[] = reverse(givenArray);
//        System.out.println("this is the reversed array: " + Arrays.toString(revArray));

        reverse2(givenArray);
//        for(int i=0; i<givenArray.length; i++){
//            System.out.print(givenArray[i] + " ");
//        }
//        System.out.println();
        System.out.println("this is the reversed array: " + Arrays.toString(givenArray));
    }
}
