class Solution {
    public boolean commonString(String[] s, String[] t) {
        HashSet<String> hs=new HashSet<>();
        for (String str:s) 
            hs.add(str);
        for (String str:t) {
            if (hs.contains(str)) {
                return true;
            }
        }
     return false;
    }
}