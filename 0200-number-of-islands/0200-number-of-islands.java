class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    floodFill(grid,i,j,grid[i][j], '2');
                    count++;
                }
            }
        }
        return count;
        
    }
    
    public void floodFill(char[][] grid, int x, int y,char orig, char replace){
        
        if(grid[x][y] == orig){
            grid[x][y] = '2';
            
        if(x < grid.length - 1){
            floodFill(grid, x + 1, y, orig, replace);
        }
        
        if(y < grid[0].length - 1){
            floodFill(grid, x, y + 1, orig, replace);
        }
            
        if(x > 0){
            floodFill(grid, x - 1, y, orig, replace);
        }
        
        if(y > 0){
            floodFill(grid, x, y - 1, orig, replace);
        }
        }
        
        
        
    }
}