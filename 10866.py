# code.plus - 덱

from collections import deque
import sys

d = deque()
n = int(input())

for i in range(n):
    res = sys.stdin.readline().split()

    if res[0] == "push_front" :
        d.appendleft(res[1])
    elif res[0] == "push_back" :
        d.append(res[1])
    elif res[0] == "pop_front" :
        if d :
            print(d[0])
            d.popleft()
        else :
            print("-1")
    elif res[0] == "pop_back" :
        if d :
            print(d[len(d) - 1])    
            d.pop()
        else :
            print("-1")
    elif res[0] == "size":
        print(len(d))
    elif res[0] == "empty" :
        if d :
            print("0")
        else :
            print("1")
    elif res[0] == "front" :
        if d :
            print(d[0])
        else :
            print("-1")
    elif res[0] == "back" :
        if d :
            print(d[len(d) - 1])
        else :
            print("-1")