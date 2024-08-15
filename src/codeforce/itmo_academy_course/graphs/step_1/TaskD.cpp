#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void dfs(vector<vector<int>>& graph, vector<bool>& visited, int v, vector<int>& component) {
    visited[v] = true;
    component.push_back(v + 1);
    for (int u : graph[v]) {
        if (!visited[u]) {
            dfs(graph, visited, u, component);
        }
    }
}

vector<int> getComponent(vector<vector<int>>& graph, vector<bool>& visited, int x) {
    vector<int> components;
    if (!visited[x]) {
        dfs(graph, visited, x, components);
    }
    return components;
}

bool check(vector<int>& component, vector<int>& path) {
    int k = 0;
    for (int c : component) {
        if (binary_search(path.begin(), path.end(), c)) {
            k++;
        }
    }

    return k == 0 || k == component.size();
}

void solve() {
    int n, m, k;
    cin >> n >> m >> k;

    vector<vector<int>> graph(n);
    vector<bool> visited(n);
    vector<int> path(k);

    for (int i = 0; i < k; ++i) {
        cin >> path[i];
    }

    sort(path.begin(), path.end());

    for (int h = 0; h < m; ++h) {
        int u, v;
        cin >> u >> v;
        graph[u - 1].push_back(v - 1);
        graph[v - 1].push_back(u - 1);
    }

    for (int i = 0; i < n; ++i) {
        vector<int> r = getComponent(graph, visited, i);
        if (!check(r, path)) {
            cout << "NO" << "\n";
            return;
        }
    }
    cout << "YES" << "\n";
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
