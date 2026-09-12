class Solution {
    public String altCase(String s) {
        StringBuilder res=new StringBuilder();

        boolean u=Character.isUpperCase(s.charAt(0));
        for (int i=0;i<s.length();i++) {
            if (u)
                res.append(Character.toUpperCase(s.charAt(i)));
            else {
                res.append(Character.toLowerCase(s.charAt(i)));
            }

            u=!u;
        }
        return res.toString();
    }
}