package run.aquan.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class TwoSum
 * @Description TODO 两数之和
 * @Author Aquan
 * @Date 2019/11/21 11:02
 * @Version 1.0
 **/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        for(int i=0 ; i <=n; i++) {
            for(int j=i+1; j<n; j++) {
                int result = nums[i] + nums[j];
                if(result == target) {
                    a = i;
                    b = j;
                }
            }
        }
        int[] resultArray = new int[]{a, b};
        return resultArray;
    }


    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[] {map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

}
