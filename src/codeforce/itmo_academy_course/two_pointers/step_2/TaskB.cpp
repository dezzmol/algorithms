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

    int res = INT_MAX;
    long long sum = 0;
    int l = 0;
    for (int r = 0; r < n; r++) {
        sum += a[r];
        while (sum - a[l] >= s) {
            sum -= a[l];
            l++;
        }
        if (sum >= s) {
            res = min(res, r - l + 1);
        }
    }
    if (res == INT_MAX) {
        cout << -1;
    } else {
        cout << res;
    }

    return 0;
}
