class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>nums.length/2){
                return e.getKey();
            }
        }
        return 0;
    }
}