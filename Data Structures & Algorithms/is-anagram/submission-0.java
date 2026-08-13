class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> fs=new HashMap<>();

         for(int i=0;i<s.length();i++){
                fs.put(s.charAt(i),fs.getOrDefault(s.charAt(i),0)+1);
         }
         for(int i=0;i<t.length();i++){
            if(fs.containsKey(t.charAt(i))){
                fs.put(t.charAt(i),fs.get(t.charAt(i))-1);}
                else{
                    return false;
                }
            if(fs.get(t.charAt(i))==0){
            fs.remove(t.charAt(i));
            }
            }
            return fs.isEmpty();
         }

    }
