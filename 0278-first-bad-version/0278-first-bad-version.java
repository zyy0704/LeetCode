/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 0;
        int hi = n;
        while(hi - lo > 1){
            int mid = lo + (hi - lo)/2;
            if(isBadVersion(mid)){
                hi = mid;
            } else{
                lo = mid;
                
            }
        }
        return hi;
        
    }
}