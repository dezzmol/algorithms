class NumArray {
private:
    vector<int> nums;
    vector<int> prefix;

    vector<int> calculatePrefix(vector<int>& nums) {
        int n = nums.size();
        vector<int> res(n + 1);
        for (int i = 0; i < n; i++) {
            res[i + 1] = nums[i] + res[i];
        }
        return res;
    }
public:
    NumArray(vector<int>& nums) {
        this->nums = nums;
        this->prefix = this->calculatePrefix(nums);
    }

    int sumRange(int left, int right) {
        return this->prefix[right + 1] - this->prefix[left];
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */