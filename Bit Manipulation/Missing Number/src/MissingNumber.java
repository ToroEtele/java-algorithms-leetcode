public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0 , 1};
        System.out.println(missingNumber(nums));
    }
}
