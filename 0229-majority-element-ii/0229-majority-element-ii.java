class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        int c1 = 0, c2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MAX_VALUE;
        
        // Moore's Voting Algo
        for(int i : nums) {
            if(c1 == 0 && (i != ele2)) {
                c1 = 1;
                ele1 = i;
            }
            else if(c2 == 0 && (i != ele1)) {
                c2 = 1;
                ele2 = i;
            }
            else if(ele1 == i) c1++;
            else if(ele2 == i) c2++;
            else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for(int i : nums) {
            if(i == ele1) c1++;
            else if(i == ele2) c2++;
        }
        if(c1 > nums.length / 3)
            res.add(ele1);
        if(c2 > nums.length / 3)
            res.add(ele2);

    return res;
    }
}