class Solution {
    public boolean checkPangram(String s) {
        boolean[] t=new boolean[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(c>='a'&&c<='z'){
                int j=c-'a';
                if(!t[j]){
                    t[j]=true;
                    count++;
                }
            }
            if(count==26)
                return true;
        }
        return false;
    }
}