#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool isDirectPathExist(int a, int b, const vector<vector<int> > &graph) {
    return find(graph[a].begin(), graph[a].end(), b) != graph[a].end();
}

bool isSimplePathOrCycle(int start, int n, const vector<int>& path) {
    vector<bool> visited(n);
    for (int i = start; i < path.size(); ++i) {
        if (visited[path[i] - 1]) {
            return false;
        }
        visited[path[i] - 1] = true;
    }
    return true;
}

void solve(int n, int m, int k) {
    vector<vector<int> > graph(n);
    vector<int> path(k);
    for (int i = 0; i < k; ++i) {
        cin >> path[i];
    }

    for (int h = 0; h < m; ++h) {
        int u, v;
        cin >> u >> v;
        graph[u - 1].push_back(v - 1);
        graph[v - 1].push_back(u - 1);
    }

    bool isSimpleCycle = true;
    bool isCycle = true;
    bool isSimplePath = true;
    bool isPath = true;

    vector<bool> visited(n);

    for (int i = 0; i < n; ++i) {
        sort(graph[i].begin(), graph[i].end());
    }

    for (int i = 0; i < k - 1; ++i) {
        if (!binary_search(graph[path[i] - 1].begin(), graph[path[i] - 1].end(), path[i + 1] - 1)) {
            cout << "none" << "\n";
            return;
        }
    }

    if (path.front() == path.back()) {
        isSimpleCycle = isSimplePathOrCycle(1, n, path);
    } else {
        isCycle = false;
        isSimpleCycle = false;
        isSimplePath = isSimplePathOrCycle(0, n, path);
    }

    if (isSimpleCycle) {
        cout << "simple cycle" << "\n";
        return;
    }

    if (isCycle) {
        cout << "cycle" << "\n";
        return;
    }

    if (isSimplePath) {
        cout << "simple path" << "\n";
        return;
    }
    if (isPath) {
        cout << "path" << "\n";
        return;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    for (int j = 0; j < t; ++j) {
        int n, m, k;
        cin >> n >> m >> k;

        solve(n, m, k);
    }

    return 0;
}
