package Array.PrintClockwise;
import java.util.ArrayList;

public class SolutionTest {

    public static void main(String[] args){
        int[][] array1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] array2 = new int[][]{{1,2},{3,4}};
        int[][] array3 = new int[][]{{1},{2},{3},{4},{5}};
        int[][] array4 = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.printMatrix(array4);
        for(Integer integer : result){
            System.out.printf(integer + " ");
        }
    }
}
