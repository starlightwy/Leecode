package array;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        OUT:
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(res-target)){
                        res = nums[i]+nums[j]+nums[k];
                        if(res==target)
                            break OUT;
                    }
                }
            }
        }
        return res;
    }

    public int discuss(int[] nums, int target) {
        int closest = 0, min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1, k = nums.length-1; j < k;) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target) {
                    return sum;
                } else if(sum < target) {
                    j++;
                    int range = Math.abs(sum - target);
                    if(range < min) {
                        min = range;
                        closest = sum;
                    }
                } else {
                    k--;
                    int range = Math.abs(sum - target);
                    if(range < min) {
                        min = range;
                        closest = sum;
                    }
                }
            }
        }
        return closest;
    }
}
