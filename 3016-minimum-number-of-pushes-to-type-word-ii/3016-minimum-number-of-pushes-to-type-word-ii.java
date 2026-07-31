class Solution {
    public int minimumPushes(String word) {
     
     Map<Character,Integer> temp = new HashMap<>();  

     int pos = 1,len=0,ele=0, res=0;

     for(int i=0;i<word.length();i++){
        temp.put(word.charAt(i),temp.getOrDefault(word.charAt(i),0)+1);
     }   
     List<Integer> dup = new ArrayList<>(temp.values());
     Collections.sort(dup,Collections.reverseOrder());
    
    // System.out.println(temp);
    //  System.out.println(dup);
    
    for(int i=0;i<dup.size();i++) {
        ele++;
        res+=pos*dup.get(i);

        if(ele==8){
            pos++;
            ele=0;
        }
    }
     return res;
    }
}