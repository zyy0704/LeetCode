class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] courses = new int[numCourses][numCourses];
        int[] degree = new int[numCourses];
        int count = 0;
        Queue<Integer> queue = new LinkedList();
        
        for(int i = 0; i < prerequisites.length; i++){
            int dependent = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            
            if(courses[dependent][prereq] == 0){
                degree[dependent]++;
            }
            courses[dependent][prereq] = 1;
        }
        
        for(int i = 0; i < degree.length; i++){
            if(degree[i] == 0){
                queue.offer(i);
            }
        }
            while(!queue.isEmpty()){
                int course = queue.poll();
                count++;
                
                for(int i = 0; i < numCourses; i++){
                    if(courses[i][course] != 0){
                        if(--degree[i] == 0){
                            queue.offer(i);
                        }
                    }
                }
                
            }
        return count==numCourses;
        
        
    }
}