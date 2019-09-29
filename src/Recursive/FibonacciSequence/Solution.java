package Recursive.FibonacciSequence;

public class Solution {

    /**
     * 大家都知道斐波那契数列,
     * 现在要求输入一个整数n，
     * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     */

    /**
     * My solution: 15ms, 9400k
     */
//    public int Fibonacci(int n) {
//        if(n < 0)
//            throw new RuntimeException("n should be bigger or equal to 1");
//        if(n == 0)
//            return 0;
//        if(n==1 || n ==2)
//            return 1;
//
//        int odd =  1;
//        int even =  1;
//        boolean isEven = false;
//        for(int i = 3; i <= n; i ++){
//            if(isEven){
//                odd = odd + even;
//            }else{
//                even = odd + even;
//            }
//            isEven = !isEven;
//        }
//        if(isEven){
//            return even;
//        }else{
//            return odd;
//        }
//    }

    /**
     * Recursive solution: 1161ms, 9268k
     */
    public int Fibonacci(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return Fibonacci(n -1) + Fibonacci(n -2);
    }
}
