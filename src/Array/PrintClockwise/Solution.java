package Array.PrintClockwise;
import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

public class Solution {
    /**
     * My solution
     */
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//        int x1 = 0;
//        int x2 = matrix[0].length - 1;
//        int y1 = 0;
//        int y2 = matrix.length - 1;
//        int x = 0;
//        int y = 0;
//        int step = 1;
//        boolean hMove = true;
//        ArrayList<Integer> result = new ArrayList<>();
//
//
//        while (x2 - x1 >= 0 && y2 - y1 >= 0) {
//            if (hMove) {
//                if (x1 <= x && x <= x2) {
//                    result.add(matrix[y][x]);
//                    x = x + step;
//                }
//                if( x < x1 || x > x2){
//                    x = x - step;
//                    y = y + step;
//                    hMove = false;
//                }
//            } else {
//                if (y1 <= y && y <= y2) {
//                    result.add(matrix[y][x]);
//                    y = y + step;
//                }
//                if (y < y1 || y > y2) {
//                    y = y - step;
//                    hMove = true;
//                    if(step > 0){
//                        x2 --;
//                        y1 ++;
//                    }else {
//                        x1 ++;
//                        y2 --;
//                    }
//                    step = -step;
//                    x = x + step;
//                }
//            }
//        }
//        if(x1 == x2 && y1 == y2)
//            result.add(matrix[y][x]);
//        return result;
//    }

    /**
     * Other Solution
     * @param matrix
     * @return
     */
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        if(m==0){
            return arr;
        }
        if(n==0){
            return arr;
        }
        int lay = (Math.min(n,m))-1/2+1;
        for(int i = 0;i < lay;i++){
            for(int k = i;k<m-i;k++) arr.add(matrix[i][k]);
            for(int k = i+1;k<n-i;k++) arr.add(matrix[k][m-i-1]);
            for(int k = m-i-2;k>=i&&(n-i-1!=i);k--) arr.add(matrix[n-i-1][k]);
            for(int k = n-i-2;k>i&&(m-1-i!=i);k--) arr.add(matrix[k][i]);
        }
        return arr;
    }

}
