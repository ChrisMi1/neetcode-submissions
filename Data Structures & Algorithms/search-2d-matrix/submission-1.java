public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bot = rows - 1;

        while (top <= bot) {
            int mid = (top + bot) / 2;

            if (matrix[mid][cols - 1] < target) {
                top = mid + 1;
            } else if (matrix[mid][0] > target) {
                bot = mid - 1;
            } else {
                break;
            }
        }

        if (!(top <= bot)) {
            return false;
        }

        int row = (top + bot) / 2;
        int topMid = 0;
        int botMid = cols - 1;

        while (topMid <= botMid) {
            int m = (topMid + botMid) / 2;

            if (matrix[row][m] < target) {
                topMid = m + 1;
            } else if (matrix[row][m] > target) {
                botMid = m - 1;
            } else {
                return true;
            }
        }

        return false;

    }

}