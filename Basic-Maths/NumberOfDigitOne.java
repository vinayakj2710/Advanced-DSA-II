
public class Solution {

    public int solve(int A) {
        long count = 0;

        for (long factor = 1; factor <= A; factor *= 10) {
            long lower = A % factor;
            long curr = (A / factor) % 10;
            long higher = A / (factor * 10);

            if (curr == 0) {
                count += higher * factor;
            } else if (curr == 1) {
                count += higher * factor + lower + 1;
            } else {
                count += (higher + 1) * factor;
            }
        }

        return (int) count;
    }
}
