import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> contained = new HashMap<Integer, Boolean>();
        for(int x : nums) {
            if(contained.get(x) == null) {
                contained.put(x, true);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,1};
        System.out.println(containsDuplicate(input));
    }
}
