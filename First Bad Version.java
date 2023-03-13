/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            boolean x = isBadVersion(mid);
            if(x==true && isBadVersion(mid-1)==false)
                return mid;
            else
                if(x==false){
                    l = mid + 1;
                }
                else
                    r = mid - 1;
        }
        return -1;
    }
}
