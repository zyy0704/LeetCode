class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<int[]> sol = new ArrayList<>();
        int[] newInterval = intervals[0];
        sol.add(newInterval);
        
        for(int[] i : intervals){
            if(i[0] <= newInterval[1]){
                newInterval[1] = Math.max(i[1], newInterval[1]);
            }else{
                newInterval = i;
                sol.add(newInterval);
            }
            
        }

        
        return sol.toArray(new int[sol.size()][]);
        
        
        
    }
}