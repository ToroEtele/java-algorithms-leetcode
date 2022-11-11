import java.util.ArrayList;
import java.util.List;

public class FindDisapearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] temp=new int[nums.length+1];

        List<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            temp[nums[i]]=nums[i];
        }

        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]==0)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }
}
