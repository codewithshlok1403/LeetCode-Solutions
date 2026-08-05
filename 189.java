class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
         reversearr(nums,0,n-1);
        reversearr(nums,0,k-1);
        reversearr(nums,k,n-1);
       
        for(int i=0;i<n;i++){
             System.out.println(nums[i]);
        }
       
        
    }
    static void reversearr(int[] arr,int i,int j){
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    
} 
