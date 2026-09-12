class Solution {
    public boolean halvesMatch(String s) {
        int n=s.length(),half=n/2;
        int[] freq=new int[26];
        for (int i=0;i<half;i++) {
            freq[s.charAt(i)-'a']++;
            freq[s.charAt(n-half+i)-'a']--;
        }
        for (int x:freq) {
            if (x!=0)
                return false;
        }
        return true;
    }
}