public class WEEK_1_WARNER{

    public static void findPairs(int [] nums, int target){
        for(int i = 0; i < nums.length - 1; i++){

            for(int j = i + 1 ; j < nums.length; j++){

                if(nums[i] + nums[j] == target){
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
                
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 9;

        findPairs(nums, target);
    }

}