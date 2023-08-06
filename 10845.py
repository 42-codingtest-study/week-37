# code.plus - 큐

import sys

queue = list()
n = int(sys.stdin.readline())

for _ in range(n) :
    res = sys.stdin.readline()
    if "push" in res :
        queue.append(int(res.split(' ')[1]))
    elif "pop" in res :				
        if not queue :
            print(-1)
        else :
            print(queue.pop(0))
    elif "size" in res :
        print(len(queue))
    elif "empty" in res :
        if not queue :
            print(1)
        else : 
            print(0)
    elif "front" in res :			
        if not queue :
            print(-1)
        else :
            print(queue[0])
    elif "back" in res :
        if not queue: print(-1)
        else :
            print(queue[-1])