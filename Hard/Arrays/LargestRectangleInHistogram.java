//Problem: Largest Rectangle in Histogram
//Link:
https://leetcode.com/problems/largest-rectangle-in-histogram/description/
// Hard Level
//Approach: use stack to store index of histogram bars;
// when a smaller bar appears, pop from the stack to calculate the rectangle area using the popped height as the smallest bar and update the maximum area.
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currheight;
            if (i == heights.length) {
                currheight= 0;
            }
            else{
                currheight=heights[i];
            }
            while (!stack.isEmpty() && currheight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int left;
                if (stack.isEmpty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }
                int right = i;
                int width = right - left - 1;

                maxarea = Math.max(maxarea, height * width);

            }
            stack.push(i);
        }
        return maxarea;
    }
}
