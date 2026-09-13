class Solution {
    public static int findSum(String s) {
        int sum=0,n=0;
        for(char c:s.toCharArray()){
            if(c>='0'&&c<='9')
                n=n*10+(c-'0');
            else{
                sum+=n;
                n=0;
            }
        }

        return sum+n;
    }
}