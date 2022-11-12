import java.util.Arrays;

public class Construct2DArray {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ret = new int[m][n];

        if( original.length != m*n ){
            return new int[0][];
        }

        for( int i = 0; i < m*n; i++){
            ret[i/n][i%n] = original[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.deepToString(construct2DArray(nums, 2, 2)));
    }
}
