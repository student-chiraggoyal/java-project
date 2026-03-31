package Day08_Arrays;

public class Practice {

    public static int findMax(int nums[]){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 4, 6, 4, 2};
        System.out.println(findMax(nums));
    }
}
