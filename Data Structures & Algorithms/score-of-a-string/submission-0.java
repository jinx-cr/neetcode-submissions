class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int asc=s.charAt(i);
            int asc1=s.charAt(i+1);
            sum=sum+(Math.abs(asc-asc1));
        }
        return sum;
    }
}