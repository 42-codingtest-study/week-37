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
    int n, a, b;
    cin >> n;
    while (n--)
    {
        cin >> a >> b;
        int prize = 0;
        if (a == 0)
            prize += 0;
        else if (a == 1)
            prize += 500;
        else if (a <= 3)
            prize += 300;
        else if (a <= 6)
            prize += 200;
        else if (a <= 10)
            prize += 50;
        else if (a <= 15)
            prize += 30;
        else if (a <= 21)
            prize += 10;
        if (b == 0)
            prize += 0;
        else if (b == 1)
            prize += 512;
        else if (b <= 3)
            prize += 256;
        else if (b <= 7)
            prize += 128;
        else if (b <= 15)
            prize += 64;
        else if (b <= 31)
            prize += 32;
        cout << prize * 10000 << '\n';
    }
}
