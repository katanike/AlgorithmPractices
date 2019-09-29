package Math.DecimalToBinary;

public class Solution {

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */

    /*
     * 该解法如果输入时负数会陷入死循环，
     * 因为负数右移时，在最高位补得是1
     * 二本题最终目的是求1的个数，那么会有无数个
     * 1了。
     */
    //-------------可能陷入死循环的解法---------------------
    public static int NumberOf1_CanNotUse(int n) {
        int count = 0;
        while (n != 0) {
            /*
             * 用1和n进行位与运算，
             * 结果要是为1则n的2进制形式
             * 最右边那位肯定是1，否则为0
             */
            if ((n & 1) == 1) {
                count++;
            }
            //把n的2进制形式往右推一位
            n = n >> 1;
        }
        return count;
    }

    //---------------正解--------------------------------
    //思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    //--------------------最优解----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

}
