class Solution {
    public static char getMaxOccuringChar(String s) {
        int[] freq=new int[26];
        for (char c:s.toCharArray()) 
            freq[c-'a']++;
        int m=0;
        char ans='a';
        for (int i=0;i<26;i++) {
            if (freq[i]>m) {
                m=freq[i];
                ans=(char) ('a'+i);
            }
        }
        return ans;
    }
}