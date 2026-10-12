class Solution {
    public int passwordStrength(String password) {

        int score = 0;
        Set<Character> pwd = new HashSet<>(); // Declared a Set to store only Unique Chars

        for (int i = 0; i < password.length(); i++) {
            if (!pwd.contains(password.charAt(i)))
                pwd.add(password.charAt(i));
        }
        // Traverse through the Set to Count the Score
        for (char ch : pwd) {
            if ('a' <= ch && ch <= 'z')
                score += 1;
            else if ('A' <= ch && ch <= 'Z')
                score += 2;
            else if ('0' <= ch && ch <= '9')
                score += 3;
            else
                score += 5;
        }
        return score;
    }
}