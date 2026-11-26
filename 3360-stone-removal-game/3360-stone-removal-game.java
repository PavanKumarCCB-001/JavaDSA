class Solution {
    public boolean canAliceWin(int n) {

        if (n < 10)
            return false;

        if (n <= 18)
            return true;

        int alice_remove = 10, bob_remove = alice_remove - 1, alice_moves = 0, bob_moves = 0;
        while (n >= alice_remove) {
            n -= alice_remove;
            alice_moves++;

            if (n >= bob_remove) {
                n -= bob_remove;
                bob_moves++;
            }

            alice_remove -= 2;
            bob_remove -= 2;
        }

        return alice_moves > bob_moves ? true : false;
    }
}