class Solution {
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        boolean [][]map= new boolean[m][n];
        int ans =0;
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                 if(grid[i][j]== '1' &&map[i][j]== false){
                 ans++;
                 dfs(i,j,grid,map);

            }
        }

       
      }   
      return ans;
    }
    public void dfs(int i, int j, char[][]grid, boolean[][]map){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||map[i][j]| grid [i][j]== '0'){
            return;
        }
        map[i][j]=true;
        dfs(i+1,j, grid,map);
        dfs(i-1,j, grid,map);
        dfs(i,j+1, grid,map);
        dfs(i,j-1, grid,map);
    }
}