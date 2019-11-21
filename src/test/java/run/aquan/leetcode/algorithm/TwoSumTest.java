package run.aquan.leetcode.algorithm;

import org.junit.jupiter.api.Test;

/**
 * @Class TwoSumTest
 * @Description TODO
 * @Author Aquan
 * @Date 2019/11/21 11:05
 * @Version 1.0
 **/
public class TwoSumTest {

    @Test
    public void Test() {
        int[] nums = {2, 15, 11, 7, 3};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] resultArray = twoSum.twoSum(nums, target);
        for (int i: resultArray) {
            System.out.print(i + ",");
        }
    }

    @Test
    public void TestHash() {
        int[] nums = {2, 15, 11, 7, 3};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] resultArray = twoSum.twoSumHash(nums, target);
        for (int i: resultArray) {
            System.out.print(i + ",");
        }
    }

}
