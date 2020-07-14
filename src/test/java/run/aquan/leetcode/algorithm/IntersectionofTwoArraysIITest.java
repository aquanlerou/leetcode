package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class IntersectionofTwoArraysIITest
 * @Description TODO
 * @Author Aquan
 * @Date 2020/7/14 11:01
 * @Version 1.0
 **/
@Slf4j
public class IntersectionofTwoArraysIITest {

    @Test
    public void test() {
        int[] nums1 = {1,2};
        int[] nums2 = {1,1};
        int[] intersect = IntersectionofTwoArraysII.intersect(nums1, nums2);
        log.warn(intersect.toString());
    }

}
