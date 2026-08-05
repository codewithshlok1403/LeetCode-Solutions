/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/
class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++){
        sum1+=nums[i];
    }
    for(int i=0;i<=n;i++){
        sum2+=i;
    }
    int missing=sum2-sum1;
    return  missing;
}
}
