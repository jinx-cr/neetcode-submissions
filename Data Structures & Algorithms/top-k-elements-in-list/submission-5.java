class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[k];
        for(int n :nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int i=0;i<k;i++){
            int c=0;
            int keyy=0;
            for(Map.Entry<Integer,Integer> e: m.entrySet()){
                if(e.getValue()>=c){
                    c=e.getValue();
                    keyy=e.getKey();
                }
            }
            m.remove(keyy);
            arr[i]=keyy;
        }
        return arr;
    }
}
