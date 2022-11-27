class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> sol = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        backtrack(sol, nums, list);
        
        return sol;
        
    }
    
    public void backtrack(List<List<Integer>> sol, int[] nums, List<Integer> list){
        if(list.size() == nums.length){
                sol.add(new ArrayList<>(list));
            }else{
        
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
            list.add(nums[i]);
            backtrack(sol, nums, list);
            list.remove(list.size() - 1);
            
        }
        }
        }
    }
}