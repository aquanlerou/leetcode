package run.aquan.leetcode.algorithm;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Class RomanToIntegerTest
 * @Description TODO 罗马数字转整数测试类
 * @Author Aquan
 * @Date 2019/12/10 17:46
 * @Version 1.0
 **/
@Slf4j
@Data
public class RomanToIntegerTest {

    @Test
    public void Test() {
        int result = RomanToInteger.romanToInt("III");
        log.warn("result:" + result);
    }

}
