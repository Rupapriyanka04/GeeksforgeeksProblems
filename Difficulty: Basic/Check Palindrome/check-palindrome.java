class Solution {
    public static boolean isPalindrome(String s) {
         int l=0,r=s.length()-1;
         while(l<r) {
             if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
                 return false;
             l++;
             r--;
         }
         return true;
    }
}