class Solution {
    public void set(int[] arr,List<List<Integer>> ans,List<Integer> curr,int idx){
        if(idx==arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        int num=arr[idx];
        set(arr,ans,curr,idx+1);
        curr.add(num);
        set(arr,ans,curr,idx+1);
        curr.remove(curr.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        set(nums,ans,curr,0);
        return ans;
    }
}
