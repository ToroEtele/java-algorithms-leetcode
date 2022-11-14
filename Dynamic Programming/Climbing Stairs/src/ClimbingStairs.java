public class ClimbingStairs {
    public static int climbStairs(int n) {
        int res = 0;
        for(int i = 0, first = 0, second = 1; i <n; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }

    public static void main(String[] args) {
	    System.out.println(climbStairs(4));
    }
}
