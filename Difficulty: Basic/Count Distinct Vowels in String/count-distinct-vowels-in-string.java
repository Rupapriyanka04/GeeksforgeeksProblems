class Solution {
    public int countVowels(String s) {
        boolean[] seen=new boolean[5];
        int count=0;
        for (char c:s.toCharArray()) {
            int index="aeiou".indexOf(c);
            if (index!=-1&&!seen[index]) {
                seen[index]=true;
                count++;
            }
        }
        return count;
    }
}