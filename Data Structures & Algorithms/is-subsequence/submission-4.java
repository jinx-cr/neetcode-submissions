class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=0;
        int tl=0;
        if(s.length()==0)return true;
        while(tl<t.length() && sl<s.length()){
            if(s.charAt(sl)==t.charAt(tl)){
                sl++;}

            tl++;
        }
        return sl==s.length();

    }
    }