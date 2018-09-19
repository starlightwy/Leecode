public class ArrayTests {
    /**
     * 在一个array中找到两个不重复的数，相加等于target。
     * */
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j==i)
                    continue;
                else if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
                else
                    continue;
            }
        }
        return null;
    }
}
