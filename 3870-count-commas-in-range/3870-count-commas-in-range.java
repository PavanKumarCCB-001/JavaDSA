class Solution {
    public int countCommas(int n) {
        // int total = 0;

        // while (n >= 1000) {
        //     total++;
        //     n--;
        // }
        // return total;
        return Math.max(n-999,0);
    }
}