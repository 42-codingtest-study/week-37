import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    a, b = map(int, input().split())

    while True:

        if a == b:
            print(a * 10)
            break

        if a > b:
            a //= 2

        else:
            b //= 2