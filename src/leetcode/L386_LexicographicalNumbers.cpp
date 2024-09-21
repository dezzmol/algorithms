class Solution {
public:
    void func(int i, int n, vector<int>& a) {
        if (i > n) {
            return;
        }
        if (i > 0) {
            a.push_back(i);
        }
        for (int j = (i == 0) ? 1 : 0; j < 10; j++) {
            int x = 10 * i + j;
            if (x > n) {
                break;
            }
            func(x, n, a);
        }
    }
    vector<int> lexicalOrder(int n) {
        vector<int> res;
        func(0, n, res);
        return res;
    }
};