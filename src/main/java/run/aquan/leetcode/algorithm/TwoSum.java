package run.aquan.leetcode.algorithm;

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

}
