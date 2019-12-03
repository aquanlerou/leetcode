package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @Class ReverseInteger
 * @Description TODO 整数反转
 * @Author Aquan
 * @Date 2019/12/2 12:44
 * @Version 1.0
 **/
@Slf4j
public class ReverseInteger {

    /**
     * 正常解法 判断是否溢出
     * TODO 注意点: 1.如果 temp = rev * 10 + pop 导致溢出,那么一定会有 rev >= (Integer.MAX_VALUE / 10)
     *             2.如果 rev > (Integer.MAX_VALUE / 10),那么 temp = rev * 10 + pop 一定会溢出
     *             3.如果 rev == (Integer.MAX_VALUE / 10),那么只要 pop > 7,temp = rev * 10 + pop 就会溢出
     * @param x
     * @return int
     */
    public static int reverseTwo(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    // 边缘值无法通过测试 -2147483648
    public static int reverse(int x) {
        if (String.valueOf(x).equals("-2147483648")) {
            return 0;
        }
        Boolean flag = x>=0 ? true:false;
        String a = String.valueOf(Math.abs(x));
        String temp = "";
        char[] chars = a.toCharArray();
        for (int i=0; i<chars.length; i++) {
            temp = chars[i] + temp;
        }
        BigDecimal l = new BigDecimal(temp.trim());
        log.warn(String.valueOf(l));
        if (flag) {
            int result = l.intValue();
            if (String.valueOf(result).equals(String.valueOf(l))) {
                return l.intValue();
            } else {
                return 0;
            }
        } else {
            int result =  l.intValue();
            if (String.valueOf(result).equals(String.valueOf(l))) {
                return result * -1;
            } else {
                return 0;
            }
        }
    }

}
