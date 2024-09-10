void sortColors(vector<int>& nums) {
    int c[3] = {0};

    for (auto num : nums) c[num]++;


    for (auto x : nums) x = 0;

    int k = 0;
    for (int i = 0; i < 3; ++i) {
        while (c[i]--) nums[k++] = i;
    }
}