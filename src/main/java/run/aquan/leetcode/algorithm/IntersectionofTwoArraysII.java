package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Class IntersectionofTwoArraysII
 * @Description TODO
 * @Author Aquan
 * @Date 2020/7/14 11:01
 * @Version 1.0
 **/
@Slf4j
public class IntersectionofTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Integer length1 = nums1.length;
        Integer length2 = nums2.length;
        if (length1 > length2) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        log.warn(map.toString());
        int[] result = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) != 0) {
                int count = map.get(num) - 1;
                map.put(num, count);
                result[index++] = num;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

}
