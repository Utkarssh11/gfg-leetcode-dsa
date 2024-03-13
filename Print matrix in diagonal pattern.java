Print matrix in diagonal pattern

  class Solution 
{
    public int[] matrixDiagonally(int[][] mat) 
     {
        int n = mat.length, m = mat[0].length, i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        boolean isUp = true;

        for(int k = 0; k < m * n; ) 
        {
            if(isUp)
            {
                for(;i >= 0 && j < m; i--, j++) 
                {
                    res.add(mat[i][j]);
                    k++;
                }

                if(i < 0 && j < m)
                    i = 0;

                if(j == m) 
                {
                    i += 2;
                    j--;
                }
            }
           else 
            {
                for(;j >= 0 && i < n; i++, j--) 
                {
                    res.add(mat[i][j]);
                    k++;
                }

                if(j < 0 && i < n)
                    j = 0;

                if(i == n) 
                {
                    j += 2;
                    i--;
                }
            }

            isUp = !isUp;
        }

        int arr[] = new int[res.size()];
        for(i = 0; i < res.size(); i++)
            arr[i] = res.get(i);

        return arr;        
    }
}
