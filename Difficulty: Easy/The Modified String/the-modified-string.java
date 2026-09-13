class Solution {
    public int modified(String s) {
        int ans=0,c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                c++;
            else{
                ans+=(c-1)/2;
                c=1;
            }
        } 
        return ans+=(c-1)/2;
    }
}