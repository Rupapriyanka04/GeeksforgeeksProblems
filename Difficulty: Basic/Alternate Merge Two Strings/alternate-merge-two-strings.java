class Solution {
    String merge(String s1, String s2) {
         int l=0,r=0;
         StringBuilder sb=new StringBuilder();
         while(l<s1.length() && r<s2.length()) {
             sb.append(s1.charAt(l));
             l++;
             sb.append(s2.charAt(r));
             r++;
         }
         while(l<s1.length()) {
             sb.append(s1.charAt(l));
             l++;
         }
         while(r<s2.length()) {
             sb.append(s2.charAt(r));
             r++;
         }
         return sb.toString();
    }
}