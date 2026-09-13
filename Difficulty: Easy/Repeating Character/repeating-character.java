class Solution {
    static int repeatedCharacter(String S) {
        int[] freq=new int[256];
        for(char c:S.toCharArray())
            freq[c]++;
        for(int i=0;i<S.length();i++){
            if(freq[S.charAt(i)]>1)
                return i;
        }
        return -1;
    }
}