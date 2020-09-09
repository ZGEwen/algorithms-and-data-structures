package leetcode.editor.cn;
//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1]
// 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘
//积是18。
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
//
//
//
// 示例 1：
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1
//
// 示例 2:
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
//
//
//
// 提示：
//
//
// 2 <= n <= 1000
//
//
// 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/
// Related Topics 数学 动态规划
// 👍 37 👎 0

// 剪绳子 II
public class JianShengZiIiLcof {
    public static void main(String[] args) {
        Solution solution = new JianShengZiIiLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //贪心的思路，尽可能多的剪长度为3的，当长度为4时剪2,2
        // 动态规划 120时 大数越界 剪绳子可以用动态规划或者贪心做，这道题对于使用DP难度就增大了一些
        // 因为数据范围变得比较大时，long已经不足以去存储中间结果的状态，但是由于DP做法是枚举各种剪的情况然后取最大值，因此只能通过使用BigInteger的方法去做
        public int cuttingRope(int n) {
            if (n <= 3) {
                return n - 1;
            }
            int mod = (int)1e9 + 7;
            long res = 1;
            while(n > 4) {
                res *= 3;
                res %= mod;
                n -= 3;
            }
            return (int)(res * n % mod);

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}