class Solution {
    public int maxDifference(String s) {
       int max=0;
       int min=s.length();
       Map<Character,Integer> m=new HashMap<>();
       for(int i=0;i<s.length();i++){
        m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
       } 
       for(Map.Entry<Character,Integer> e:m.entrySet()){
        if(e.getValue()>max && e.getValue()%2!=0)max=e.getValue();
        if(e.getValue()<min && e.getValue()%2==0)min=e.getValue();
       }
       return max-min;
    }
}