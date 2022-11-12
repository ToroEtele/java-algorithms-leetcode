import java.util.Arrays;

public class Main {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd = new int[n];

        leftProd[0] = 1;
        for (int i = 1; i < n; ++i)
            leftProd[i] = nums[i - 1] * leftProd[i - 1]; // [1, 1*1, 2*1, 3*3] -> [1, 1, 2, 6]

        int R = 1;
        for (int i = n - 1; i >= 0; --i) {               // [R*leftProd[i]]
            leftProd[i] = R * leftProd[i];               // [24*1, 12*1, 4*2,  1*6]
            R *= nums[i];          // R = R*nums[i]   =>    R=12*2 R=4*3 R=1*4 R=1
        }

        return leftProd;
    }

    public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
