class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]nge=find(nums2);
        HashMap<Integer, Integer>map= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i], nge[i]);
        }
        int []ans=new int[nums1.length];
        for(int i=0; i<ans.length; i++){
            ans[i]= map.get(nums1[i]);
        }
        return ans;
        
    }
    public int[]find(int[]nums){
        Stack<Integer>s=new Stack<>();
        int ans[]= new int [nums.length];
        for(int i= nums.length-1; i>=0; i--){
            while(!s.isEmpty()&&s.peek()<=nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
               ans[i]=-1;

            }
            else{
                 ans[i]=s.peek();
            }
            s.push(nums[i]);
     
        }
        return ans;
    }
    
}