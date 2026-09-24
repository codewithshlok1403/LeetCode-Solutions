class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int n=nums.length;
        int add=0;
        for(int i=0;i<n;i++){
            add+=nums[i];
            int rem=add%k;
             if (rem < 0) rem += k; 
            if(mp.containsKey(rem)){
                int preIdx=mp.get(rem);
                if(i-preIdx>=2){
                    return true;
                }
            }
            else{
                    mp.put(rem,i);
                }
            
        }
        return false;
    }
}
