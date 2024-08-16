#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;


void solve() {
    long long m;
    cin >> m;

    int n = static_cast<int>(std::ceil((1 + std::sqrt(1 + 8 * m)) / 2));

    cout << n << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t-- > 0) {
        solve();
    }

    return 0;
}
