class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li=new ArrayList<>();
            li.add(1);
            for(int j=0;j<i-1;j++){
                li.add(l.get(i-1).get(j)+l.get(i-1).get(j+1));
            }
            if(i>0)li.add(1);
            l.add(li);
        }
        return l;
        
    }
}