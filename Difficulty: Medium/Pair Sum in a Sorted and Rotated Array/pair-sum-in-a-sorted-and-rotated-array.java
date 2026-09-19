class Solution {
    public boolean pairInSortedRotated(int[] arr, int target) {
        int n=arr.length; 
        int p=0;
        for(int i=0;i<n-1;i++) {
            if(arr[i]>arr[i + 1]) {
                p=i+1;
                break;
            }
        }
        int l = p,r=(p-1+n)%n;
        while(l != r) {
            int sum = arr[l] + arr[r];
            if(sum == target)
                return true;
            else if(sum < target)
                l = (l + 1) % n;
            else
                r = (r - 1 + n) % n;
        }
        return false;
    }
}