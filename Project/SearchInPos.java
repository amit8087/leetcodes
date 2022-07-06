class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else
            {
                if(nums[mid]>target)
                {
                    right=mid-1;
                    ans=mid;
                }
                else
                {
                    left=mid+1;
                    ans=mid+1;
                }
            }
        }
        return ans;
    }
}