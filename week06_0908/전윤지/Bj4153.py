import sys

for line in sys.stdin:
    a, b, c = map(int, line.split())
    if a == b == c == 0:
        break
    x, y, z = sorted((a, b, c))
    print("right" if x*x + y*y == z*z else "wrong")
