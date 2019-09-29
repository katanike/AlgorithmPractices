package com.company.steve.SwapEvenForward;

public class SolutionTest {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        Solution solution = new Solution();
        solution.reOrderArray(array);
        for(int i = 0; i <  array.length; i ++)
            System.out.println(array[i] + ",");
    }
}
