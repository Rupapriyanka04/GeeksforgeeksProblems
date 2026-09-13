class Solution {
    public static String encode(String s) {
        StringBuilder res=new StringBuilder();
        int count=1;
        for (int i=1;i<s.length();i++) {
            if (s.charAt(i)==s.charAt(i - 1))
                count++;
            else {
                res.append(s.charAt(i - 1)).append(count);
                count=1;
            }
        } 
        res.append(s.charAt(s.length()-1)).append(count);
        return res.toString();
    }
}