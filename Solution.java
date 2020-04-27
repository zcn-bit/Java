
public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] minimumPathSum=new int[m][n];//重新搞一个数组，存放目前为止的最小路径和
        minimumPathSum[0][0]=grid[0][0];//它是初始值，解决问题的根源
        for (int i=1;i<m;i++){//处理最左一列
           minimumPathSum[i][0]=grid[i][0]+minimumPathSum[i-1][0];
        }//lie
        for (int j=1;j<n;j++){//处理最上一行
            minimumPathSum[0][j]=grid[0][j]+minimumPathSum[0][j-1];
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){//处理内层矩形框数组
                minimumPathSum[i][j]=Math.min(minimumPathSum[i][j-1],minimumPathSum[i-1][j])+grid[i][j];
            }
        }
        return minimumPathSum[m-1][n-1];

    }
}