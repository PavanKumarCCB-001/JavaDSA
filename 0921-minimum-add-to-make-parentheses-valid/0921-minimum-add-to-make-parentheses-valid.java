class Solution {
    public int minAddToMakeValid(String s) {
        int op = 0, cp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                op++;
            else if(s.charAt(i) == ')' && op > 0)
                op--;
            else 
                cp++;
        }
        return op+cp;
    }
}