package run.aquan.leetcode.algorithm;

import java.util.Collections;
import java.util.List;

/**
 * @Class Triangle
 * @Description TODO
 * @Author Aquan
 * @Date 2020/7/14 15:38
 * @Version 1.0
 **/
public class Triangle {
    private Triangle() {}
    public static int minimumTotal(List<List<Integer>> triangle) {
        // f[i][j]=min(f[i−1][j−1],f[i−1][j])+c[i][j]
        int n = triangle.size();
        // dp[i][j] 表示从点 (i, j) 到底边的最小路径和。
        int[][] dp = new int[n + 1][n + 1];
        // 从三角形的最后一行开始递推。
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
