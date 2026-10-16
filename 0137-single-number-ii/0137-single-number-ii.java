class Solution {
    public int singleNumber(int[] nums) {
        int ele=0;
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i:nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer>mp:hm.entrySet()) {
            if(mp.getValue() == 1)
                ele = mp.getKey();
        }
    return ele;
    }
}