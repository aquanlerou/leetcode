package run.aquan.leetcode.algorithm;

import java.lang.StringBuilder;

/**
 * @Class PalindromeNumber
 * @Description TODO 回文数
 * @Author Aquan
 * @Date 2019/12/3 11:25
 * @Version 1.0
 **/
public class PalindromeNumber {

    // TODO 第一眼解法
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        String s1 = String.valueOf(x);
        StringBuilder s2 = new StringBuilder();
        char[] chars = s1.toCharArray();
        for (int i=chars.length-1; i>=0; i--) {
            s2 = s2.append(chars[i]);
        }
        return s1.equals(s2.toString());
    }

    // TODO 暴力简洁解法
    public static boolean isPalindromeTwo(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }

    // TODO 进阶解法--数学解法
    public static boolean isPalindromeThree(int x) {
        return true;
    }

}