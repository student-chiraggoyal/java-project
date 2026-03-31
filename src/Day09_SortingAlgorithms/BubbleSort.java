package Day09_SortingAlgorithms;

public class BubbleSort {

    //time complexity is O(n^2) here.... hence it is not an optimized solution of the bubble sort..
//    public static void bubbleSort(int arr[]){
//        for(int i=0; i<arr.length-1; i++){      //here i represents the no of turns
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

    //optimized solution having time complexity of O(n)...by using count no of swaps
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){      //here i represents the no of turns
            int swap = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printarr(arr);
    }
}
