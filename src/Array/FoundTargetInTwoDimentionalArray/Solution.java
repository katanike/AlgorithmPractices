package com.company.steve.FoundTargetInTwoDimentionalArray;

public class Solution {

    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int column = array[0].length;
        int rowPtr = 0;
        int columnPtr = column - 1;
        boolean found = false;
        while(rowPtr <= row -1 && columnPtr >= 0){
            if(array[rowPtr][columnPtr] > target){
                columnPtr --;
            }else if(array[rowPtr][columnPtr] < target){
                rowPtr ++;
            }else{
                found = true;
                break;
            }
        }
        return found;
    }
}
