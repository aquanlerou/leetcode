package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;

import javax.management.StringValueExp;
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

    public static int romanToInt(String s) {


        /**
         * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
         * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
         * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
         **/
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        char[] chars = s.toCharArray();
        Integer result = 0;
        String pre = "";
        for (int i=0; i<chars.length; i++) {
            String key = String.valueOf(chars[i]);
            pre = key;
            boolean flag = romanMap.containsKey(key);
            if (flag) {
                Integer value = romanMap.get(key);
                // if (key)

                log.info("Key:" + chars[i] + "  Value:" + value);
                result += value;
            } else {
                return -1;
            }
        }
        return result;

    }

}
