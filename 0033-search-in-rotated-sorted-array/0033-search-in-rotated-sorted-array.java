class Solution {
    public int search(int[] nums, int target) {
        
        int lo = 0;
        int hi = nums.length - 1;
        
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            
            int loNum = nums[lo];
            int midNum = nums[mid];
            int hiNum = nums[hi];
            
            if(loNum == target){
                return lo;
            }
            
            if(midNum == target){
                return mid;
            }
            
            if(hiNum == target){
                return hi;
            }
            
            if(loNum <= midNum){
                if(target > midNum || target < loNum){
                    lo = mid + 1;
                } else{
                    hi = mid - 1;
                }
            }else{
                 if (target < midNum || target > hiNum){
                hi = mid - 1;
            } else{
                     lo = mid + 1;
                 }
                
            }         
        }
        
        return -1;
        
    }
}