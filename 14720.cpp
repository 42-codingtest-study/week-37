#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;

#define fast                          \
    ios_base::sync_with_stdio(false); \
    cin.tie(0), cout.tie(0)
#define ll long long

int main()
{
    fast;
    int n, m;
    cin >> n;
    int milk = 0, cnt = 0;
    while (n--)
    {
        cin >> m;
        if (milk == 0 && m == 0)
        {
            milk = 1;
            cnt++;
        }
        else if (milk == 1 && m == 1)
        {
            milk = 2;
            cnt++;
        }
        else if (milk == 2 && m == 2)
        {
            milk = 0;
            cnt++;
        }
    }
    cout << cnt;
}
