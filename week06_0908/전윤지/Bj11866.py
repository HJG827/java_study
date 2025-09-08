import sys
from collections import deque

input = sys.stdin.readline
N, K = map(int, input().split())



people = list(range(1, N + 1))  # [1, 2, ..., N]
order = []
idx = 0  # 현재 제거할 위치

while people:
    idx = (idx + K - 1) % len(people)  # 원형으로 인덱스 이동
    order.append(people.pop(idx))      # K번째 제거

"""
N이 수십만 이상이면 deque+rotate가 더 효율적
q = deque(range(1, N + 1))

while q:
    q.rotate(-(K - 1)) 
    order.append(q.popleft())
"""
print("<" + ", ".join(map(str, order)) + ">")
