class Solution {
    public String reverse(String S) {
         Stack<Character> res=new Stack<>();
         for(int i=0;i<S.length();i++)
            res.push(S.charAt(i));
         String ans="";
         while(!res.isEmpty()) {
             ans+=res.pop();
         }
         return ans;
    }
}