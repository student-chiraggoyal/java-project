package Day08_Arrays;

public class PrintSubArraysSumMinMax {

    //brute force method
    public static void subArrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=i;  j<numbers.length; j++){
                int sum = 0;        //Har new subarray ke liye sum dubara 0 se start hota hai
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    sum+=numbers[k];
                }
                System.out.print(" " + "=" + " " + sum);
                if(sum < min)
                    min = sum;
                else if(sum > max)
                    max = sum;
                System.out.println();
            }
            System.out.println("max value is " + max);
            System.out.println("min value is " + min);
            System.out.println();
        }
    }

    //prefix method- max sum of subarray
    public static void PrefixsubArrays(int numbers[]){
//        int sum=0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i;  j<numbers.length; j++){
                int sum = i==0? prefix[j] : prefix[j] - prefix[i-1];
                System.out.print(sum);
                if(sum > max)
                    max = sum;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max value is " + max);
    }

    //kadane's algorithm - max sum of subarray
    public static void KadanesubArray(int numbers2[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers2.length; i++){
            currentSum += numbers2[i];
            if(currentSum < 0 ){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("sum is " + currentSum);
        System.out.println("max value is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
//        subArrays(numbers);
//        PrefixsubArrays(numbers);

        int numbers2[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadanesubArray(numbers2);

        System.out.println("the total no of subarrays are: " + ((numbers.length*(numbers.length+1))/2));
    }
}
