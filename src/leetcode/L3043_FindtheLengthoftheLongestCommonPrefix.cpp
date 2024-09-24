class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<string, int> map;
        for (int n : arr1) {
            string s = to_string(n);
            string prefix = "";
            for (char c : s) {
                prefix += c;
                map[prefix]++;
            }
        }
        int res = 0;
        for (int n : arr2) {
            string s = to_string(n);
            string prefix = "";
            for (char c : s) {
                prefix += c;
                if (map.find(prefix) != map.end()) {
                    res = max(res, (int)prefix.length());
                }
            }
        }
        return res;
    }
};