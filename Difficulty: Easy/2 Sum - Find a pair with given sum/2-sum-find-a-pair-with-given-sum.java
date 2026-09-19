class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if(hs.containsKey(need)) {
                ans.add(need);
                ans.add(arr[i]);
                return ans;
            }
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }
}