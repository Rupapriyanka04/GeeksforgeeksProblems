class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++) {
            int x=target-arr[i];
            if(hs.containsKey(x))
                count=count+hs.get(x);
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}