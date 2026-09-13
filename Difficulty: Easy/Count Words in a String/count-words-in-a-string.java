class Solution {
    public int countWords(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'&&
            (i==0||!(s.charAt(i-1)>='a'&&s.charAt(i-1)<='z')))
                count++;
        }
        return count;
    }
}