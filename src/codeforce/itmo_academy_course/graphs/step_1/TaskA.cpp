#include <iostream>
#include <unordered_map>
#include <unordered_set>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    for (int i = 0; i < t; ++i) {
        int n, m;
        cin >> n >> m;
        unordered_map<int, unordered_set<int> > graph;
        bool isGraph = true;

        for (int j = 0; j < m; ++j) {
            int u, v;
            cin >> u >> v;

            if (!isGraph) {
                continue;
            }

            if (u == v) {
                isGraph = false;
                continue;
            }

            if (graph[v].count(u) > 0 || graph[u].count(v) > 0) {
                isGraph = false;
                continue;
            }

            graph[u].insert(v);
        }

        if (isGraph) {
            cout << "YES" << "\n";
        } else {
            cout << "NO" << "\n";
        }
    }

    return 0;
}
