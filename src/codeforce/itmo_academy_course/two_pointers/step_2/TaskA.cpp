#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;



int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    unsigned long long s;
    int n;

    cin >> n >> s;
    vector<int> a(n);
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
    }

    int res = 0;
    long long sum = 0;
    int l = 0;
    for (int r = 0; r < n; r++) {
        sum += a[r];
        while (sum > s) {
            sum -= a[l];
            l++;
        }

        res = max(res, r - l + 1);
    }

    cout << res;

    return 0;
}
