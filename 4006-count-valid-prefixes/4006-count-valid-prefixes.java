class Solution {
    public int countValidPrefixes(String s) {

        int prefix = 0, x = 0, y = 0; // 0's -> x & 1's -> y

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '0')
                x++;
            else
                y++;

            if (Math.abs(y - x) <= 1)
                prefix++;
        }
        return prefix;
    }
}