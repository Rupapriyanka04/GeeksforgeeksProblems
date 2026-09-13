class Solution {
    String removeDuplicates(String s) {
        boolean[] seen=new boolean[52];
        StringBuilder res=new StringBuilder();
        for (char c:s.toCharArray()) {
            int i;
            if (c>='a')
                i=c-'a';
            else
                i=c-'A'+26;
            if (!seen[i]) {
                seen[i]=true;
                res.append(c);
            }
        }
        return res.toString();
    }
}