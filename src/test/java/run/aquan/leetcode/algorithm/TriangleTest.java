package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Class TriangleTest
 * @Description TODO
 * @Author Aquan
 * @Date 2020/7/14 15:43
 * @Version 1.0
 **/
@Slf4j
public class TriangleTest {

    @Test
    public void Test() {
        // [[2],[3,4],[6,5,7],[4,1,8,3]];
        List<List<Integer>> test = Arrays.asList(Collections.singletonList(2), Arrays.asList(3,4), Arrays.asList(6,5,7), Arrays.asList(4,1,8,3));
        int i = Triangle.minimumTotal(test);
        log.warn("i:" + i);
    }

}
