class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int totalsum = 0;
        for(int ele:nums)
            totalsum+=ele;
        for(int i = 0; i < nums.length; i++){
            if(((totalsum-nums[i])) == lsum*2)
                return i;
            lsum += nums[i];
        }
        return -1;
    }
}
