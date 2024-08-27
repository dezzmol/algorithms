#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> p;
vector<int> points;
vector<int> _size;

int find(int a) {
    while (a != p[a]) {
        a = p[a];
    }
    return a;
}

void merge(int a, int b) {
    a = find(a);
    b = find(b);

    if (a == b) {
        return;
    }

    if (_size[b] > _size[a]) {
        swap(a, b);
    }

    p[b] = a;
    _size[a] += _size[b];

    points[b] -= points[a];
}

void addExp(int x, int v) {
    x = find(x);
    points[x] += v;
}

int getExp(int a) {
    int point = points[a];

    while (a != p[a]) {
        a = p[a];
        point += points[a];
    }

    return point;
}

int main() {
    int n, m;
    cin >> n >> m;

    p.resize(n + 1);
    points.resize(n + 1);
    _size.resize(n + 1);

    for (int i = 0; i <= n; i++) {
        p[i] = i;
        points[i] = 0;
        _size[i] = 1;
    }

    for (int i = 0; i < m; i++) {
        string command;
        cin >> command;

        if (command == "add") {
            int x, v;
            cin >> x >> v;
            addExp(x, v);
        }
        else if (command == "join") {
            int x, y;
            cin >> x >> y;
            merge(x, y);
        }
        else if (command == "get") {
            int x;
            cin >> x;
            cout << getExp(x) << endl;
        }
    }

    return 0;
}
