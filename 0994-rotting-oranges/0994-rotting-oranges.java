class Solution {
    public int orangesRotting(int[][] grid) {
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    floodFill(grid, i, j, 2);
                }
            }
        }
    
        
    int mins = 2;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return -1;
                } else{
                    mins = Math.max(mins,grid[i][j]);
                }
            }
        }
        //System.out.println(rotten.get(0)[0]);
        return mins - 2;
    }
    
    private void floodFill(int[][] grid, int x, int y, int mins){
        
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 ||
           (grid[x][y] > 1 && grid[x][y] < mins)){
            return;
        }else {
            grid[x][y] = mins;
            
            if(x < grid.length ){
            floodFill(grid, x + 1, y , mins + 1);
        }
            
            if(y < grid[0].length){
                floodFill(grid, x, y + 1, mins + 1);
            }
            
            if(x > 0){
                floodFill(grid, x - 1, y, mins + 1);
            }
            
            if(y > 0){
             floodFill(grid, x, y - 1, mins + 1);   
            }  
            
        }
        
    }
}