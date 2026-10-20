class Solution {
    public int countDigits(int num) {
        int c = 0, temp = num;

        while (temp != 0) {
            int ed = temp % 10;
            if (num % ed == 0)
                c++;
            temp /= 10;
        }
        return c;
    }
}