import sys
input = sys.stdin.readline

n, m = map(int, input().split())
memo = {}
for _ in range(n) :
    site, passwd = map(str, input().split())
    memo[site] = passwd

for _ in range(m) :
    site = input().rstrip()
    print(memo[site])