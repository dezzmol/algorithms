class Solution {
public:
    void solve1(vector<vector<int>>& res, vector<int>& st, vector<int>& q, int start, int n, int k) {
        if (n <= 0 && k != 0 || n != 0 && k <= 0) {
            return;
        }
        if (n == 0 && k == 0) {
            vector<int> a(st);
            res.push_back(a);
        }
        for (int i = start; i < q.size(); i++) {
            st.push_back(q[i]);
            solve1(res, st, q, i + 1, n - q[i], k - 1);
            st.pop_back();
        }
    }

    vector<vector<int>> combinationSum3(int k, int n) {
        vector<int> q {9, 8, 7, 6, 5, 4, 3, 2, 1};
        vector<vector<int>> res;
        vector<int> temp;
        solve1(res, temp, q, 0, n, k);
        return res;
    }
};