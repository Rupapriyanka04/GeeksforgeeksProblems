class Solution {
    ArrayList<Integer> wordLengths(String s) {
        ArrayList<Integer> ans=new ArrayList<>();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            ans.add(words[i].length());
        }
        return ans;
    }
}