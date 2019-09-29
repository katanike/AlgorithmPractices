package Recursive.FrogJump.Version1;

public class Solution {
    /**
     * 题目描述
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */

    /**
     * My solution: 14ms, 9408k
     */
//    public int JumpFloor(int target) {
//        int odd =  1;
//        int even = 2;
//        if(target <= 0)
//            throw new RuntimeException("target should be bigger or equal to 1");
//        if(target == 1)
//            return odd;
//        if(target == 2)
//            return even;
//
//        boolean isOdd = true;
//        for(int i = 3; i <= target; i ++){
//            if(isOdd){
//                odd = odd + even;
//            }else{
//                even = odd + even;
//            }
//            isOdd = !isOdd;
//        }
//        if(isOdd){
//            return even;
//        }else{
//            return odd;
//        }
//    }

    /**
     * Recursive Solution: 556ms, 9416k
     */
    public int JumpFloor(int target) {
        if(target <= 0)
            throw new RuntimeException("target should be no less than 1");
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
