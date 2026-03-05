//Problem: Search a 2D Matrix
//Link:
https://leetcode.com/problems/search-a-2d-matrix/description/
// Medium Level
//Approach: high low and mid approach
// this take time complexity of O(n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        int low=0;
        int high=r*c-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/c;
            int column=mid%c;
            if(matrix[row][column]==target){
                return true;
            }
            if(matrix[row][column]>target){
                high=mid-1;
            }
            if(matrix[row][column]<target){
                low=mid+1;
            }
        }
        return false;
        }
    }    
