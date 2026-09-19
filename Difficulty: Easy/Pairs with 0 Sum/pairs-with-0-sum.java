class Solution {
    public ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0,r = arr.length - 1;
        while(l<r) {
            int s=arr[l]+arr[r];
            if(s==0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[l]);
                pair.add(arr[r]);
                ans.add(pair); 
                int left = arr[l],right = arr[r];
                while(l<r&&arr[l]==left)
                    l++;
                while(l<r&&arr[r]==right)
                    r--;
            }
            else if(s<0) 
                l++;
            else 
                r--;
        }
        return ans;
    }
}