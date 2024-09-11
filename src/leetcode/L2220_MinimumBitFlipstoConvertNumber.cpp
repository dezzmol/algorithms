class Solution {
public:
    int minBitFlips(int start, int goal) {
        int xorRes = start ^ goal;
        int res = 0;
        while (xorRes > 0) {
            res += xorRes & 1;
            xorRes >>= 1;
        }
        return res;
    }
};