import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int n) {
        int[] result = new int[n+1];

        result[0] = 0;

        for(int i=1; i<=n; i++){
            result[i] = i%2 == 0 ? result[i/2] : result[i/2] + 1;
        }

        return result;
    }

    public static void main(String[] args) {
	int n = 4;

    System.out.println(Arrays.toString(countBits(n)));
    }
}
