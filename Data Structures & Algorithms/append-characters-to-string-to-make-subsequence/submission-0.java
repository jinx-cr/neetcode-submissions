class Solution {
    public int appendCharacters(String s, String t) {
        int sl=0;
        int tl=0;
        while(sl<s.length() && tl<t.length()){
            if(s.charAt(sl)==t.charAt(tl)){
                tl++;
            }
            sl++;
        }
        return t.length()-tl;
    }
}