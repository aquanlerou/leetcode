package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Class ReverseIntegerTest
 * @Description TODO 整数反转测试类
 * @Author Aquan
 * @Date 2019/12/2 14:02
 * @Version 1.0
 **/
@Slf4j
public class ReverseIntegerTest {

    @Test
    public void Test() {
        // int i = (int) (Math.pow(2, 31)); //2147483647
        int i = -2147483647;
        int reverse = ReverseInteger.reverseTwo(i);
        log.warn(String.valueOf(reverse));

    }

}
