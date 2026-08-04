class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int first=0;
        int last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]<target){
                first=mid+1;
            }
            else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                result[0]=mid;
                last=mid-1;
            }
        }

        first=0;
        last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]<target){
               first=mid+1;
            }
            else if(nums[mid]>target){
               last=mid-1;
            }
            else{
                result[1]=mid;
                first=mid+1;
            }

        }

    
        return result; 
    }
}
