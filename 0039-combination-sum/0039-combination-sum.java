class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(candidates, target, curr, result, 0);
        
        return result;
        
    }
    
    public void getResult(int[] candidates, int target, List<Integer> curr, List<List<Integer>> result, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && candidates[i] <= target; i++){
                curr.add(candidates[i]);
                getResult(candidates, target - candidates[i], curr, result, i);
                curr.remove(curr.size() - 1);
            }
        }else if(target == 0){
            result.add(new ArrayList<Integer>(curr));
        }
    }
}