class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> sol = new ArrayList<>();
        
        backtrace(nums, new ArrayList<>(), sol);
        return sol;
        
    }
    
    public void backtrace(int[] nums, List<Integer> arr, List<List<Integer>> sol){
        
        if(arr.size() == nums.length){
            sol.add(new ArrayList<>(arr));
        }else{
        
        for(int i = 0; i < nums.length; i++){
            
            if(!arr.contains(nums[i])){
            arr.add(nums[i]);
            
            backtrace(nums, arr, sol);
            arr.remove(arr.size() - 1);
        }
            }
        }
        
    }
}