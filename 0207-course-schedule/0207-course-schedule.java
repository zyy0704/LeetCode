class Solution {
    //TOPOLOGICAL SORTING
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] courses = new int[numCourses][numCourses];  //matrix of course x prereq
        int[] degree = new int[numCourses]; //degree of dependent courses 
        int count = 0;
        Queue<Integer> queue = new LinkedList();
        
        for(int i = 0; i < prerequisites.length; i++){
            int dependent = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            
            if(courses[dependent][prereq] == 0){    // if (course, prereq) not in matrix yet
                degree[dependent]++;    // add one to course's (dependent) degree
            }
            courses[dependent][prereq] = 1; // add (course, prereq) to matrix
        }
        
        for(int i = 0; i < degree.length; i++){
            if(degree[i] == 0){     //if course is not a dependent, add course to queue
                queue.offer(i); 
            }
        }
            while(!queue.isEmpty()){
                int course = queue.poll(); // dequeue first non-dependent course
                count++;
                
                for(int i = 0; i < numCourses; i++){
                    if(courses[i][course] != 0){ // if course has dependents
                        if(--degree[i] == 0){
                            queue.offer(i); // add to queue if it is no longer dependent after the dequeue
                        }
                    }
                }
                
            }
        return count==numCourses;
        
        
    }
}