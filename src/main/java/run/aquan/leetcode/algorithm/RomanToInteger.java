package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class RomanToInteger
 * @Description TODO 罗马数字转整数
 * @Author Aquan
 * @Date 2019/12/10 17:21
 * @Version 1.0
 **/
@Slf4j
public class RomanToInteger {

    /**
     * 自己的解法
     * 执行用时 :11 ms, 在所有 java 提交中击败了41.20%的用户
     * 内存消耗 :36.9 MB, 在所有 java 提交中击败了95.05%的用户
     **/
    public static int romanToInt(String s) {
        /**
         * TODO: I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
         *       X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
         *       C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
         **/
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        // TODO: 特殊字符
        romanMap.put("IV", 4);
        romanMap.put("IX", 9);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);
        Integer result = 0;
        for (int i=0; i<s.length(); ){
            boolean flag = romanMap.containsKey(s.substring(i, i+1));
            if (!flag) return -1;
            if (i+1 < s.length() && romanMap.containsKey(s.substring(i, i+2))) {
                result += romanMap.get(s.substring(i, i+2));
                i += 2;
            } else {
                result += romanMap.get(s.substring(i, i+1));
                i++;
            }
        }
        return result;
    }

    /**
     * 执行用时 :4 ms, 在所有 java 提交中击败了99.96%的用户
     * 内存消耗 :36.2 MB, 在所有 java 提交中击败了98.07%的用户
     * 作者：fanrax
     * 链接：https://leetcode-cn.com/problems/roman-to-integer/solution/bao-li-fa-zhi-xing-yong-shi-4-ms-zai-suo-you-java-/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     **/
    public int romanToIntTwo(String s) {
        char[] ch = s.toCharArray();
        int num = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == 'I' && (ch[i + 1] == 'V' || ch[i + 1] == 'X'))
                num -= 2;
            if(ch[i] == 'X' && (ch[i + 1] == 'L' || ch[i + 1] == 'C'))
                num -= 20;
            if(ch[i] == 'C' && (ch[i + 1] == 'D' || ch[i + 1] == 'M'))
                num -= 200;
        }
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'M': {
                    num += 1000;
                    continue;
                }
                case 'D': {
                    num += 500;
                    continue;
                }
                case 'C': {
                    num += 100;
                    continue;
                }
                case 'L': {
                    num += 50;
                    continue;
                }
                case 'X': {
                    num += 10;
                    continue;
                }
                case 'V': {
                    num += 5;
                    continue;
                }
                default: {
                    num += 1;
                    continue;
                }
            }
        }
        return num;
    }


}
