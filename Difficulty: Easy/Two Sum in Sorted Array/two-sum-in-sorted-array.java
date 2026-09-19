class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0;
        int r=arr.length-1;
        while(l<r) {
            int sum=arr[l]+arr[r];
            if(sum==target) {
                ans.add(l + 1);
                ans.add(r + 1);
                return ans;
            }
            else if(sum<target) 
                l++;
            else 
                r--;
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}