class Solution {
    boolean twoSum(int arr[], int target) { 
         HashSet<Integer> hs=new HashSet<>();
         for(int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if(hs.contains(need))
                return true;
            hs.add(arr[i]);
         }
         return false;
    }
}