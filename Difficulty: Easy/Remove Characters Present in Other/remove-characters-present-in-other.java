class Solution {
    public String removeChars(String s1, String s2) {
        boolean[] seen=new boolean[26];
        for(char c:s2.toCharArray())
            seen[c-'a']=true;
        StringBuilder res=new StringBuilder();
        for(char c:s1.toCharArray()){
            if(!seen[c-'a'])
                res.append(c);
        }
        return res.toString();
    }
}