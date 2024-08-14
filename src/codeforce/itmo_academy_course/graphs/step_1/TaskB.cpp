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

        unordered_map<int, unordered_set<int>> graph;

        for (int j = 0; j < m; ++j) {
            int u, v;
            cin >> u >> v;
            graph[u].insert(v);
            graph[v].insert(u);
        }

        for (int j = 1; j < n + 1; ++j) {
            cout << graph[j].size() << " ";
        }
        cout << "\n";
    }

    return 0;
}
