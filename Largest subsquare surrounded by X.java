GFG Java Solution
  Largest subsquare surrounded by X

  class Solution {
    int largestSubsquare(int n, char a[][]) {
        // code here

         int[][] right = new int[n][n];
        int[][] down = new int[n][n];

        // Preprocess to fill right and down arrays
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (a[i][j] == 'X') {
                    if (j == n - 1) right[i][j] = 1;
                    else right[i][j] = right[i][j + 1] + 1;
                }

                if (a[j][i] == 'X') {
                    if (j == n - 1) down[j][i] = 1;
                    else down[j][i] = down[j + 1][i] + 1;
                }
            }
        }

        // Find the largest square surrounded by 'X'
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // The minimum size of the square that can be formed at (i, j)
                int size = Math.min(right[i][j], down[i][j]);

                while (size > maxSize) {
                    if (right[i + size - 1][j] >= size && down[i][j + size - 1] >= size) {
                        maxSize = size;
                    }
                    size--;
                }
            }
        }

        return maxSize;
    }
}

    
