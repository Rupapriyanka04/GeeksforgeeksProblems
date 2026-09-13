class Solution {
    public static boolean makePalindrome(String[] arr) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String s:arr)
            hm.put(s,hm.getOrDefault(s,0)+1);
        int odd=0;
        for(String s:hm.keySet()){
            String rev=new StringBuilder(s).reverse().toString();
            if(s.equals(rev)){
                if(hm.get(s)%2!=0)
                    odd++;
            }else{
                if(hm.getOrDefault(rev,0)!=hm.get(s))
                    return false;
            }
        }
        return odd<=1;
    }
}