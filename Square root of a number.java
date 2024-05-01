
// x: element to find square root
class Solution {
    long floorSqrt(long x) {
        // Your code here
        long y = 0;
        for (long i = 1; i <= (x / 2) + 1; i++) {
            if (i * i > x) {
                y = i - 1;
                break;
            }
            if (i * i == x) {
                y = i;
                break;
            }
        }
        return y;

    }
}
