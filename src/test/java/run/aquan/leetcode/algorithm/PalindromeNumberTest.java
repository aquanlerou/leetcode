package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Class PalindromeNumberTest
 * @Description TODO 回文数测试类
 * @Author Aquan
 * @Date 2019/12/4 14:53
 * @Version 1.0
 **/
@Slf4j
public class PalindromeNumberTest {

    @Test
    public void Test() {
        boolean palindrome = PalindromeNumber.isPalindrome(121);
        if (palindrome) log.info(String.valueOf(palindrome));
        else log.error(String.valueOf(palindrome));
    }

}
