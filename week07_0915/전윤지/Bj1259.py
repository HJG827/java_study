import sys

def is_pal_num(n: int) -> bool:
    rev, x = 0, n
    while x > 0:
        rev = rev * 10 + x % 10
        x //= 10
    return rev == n

for line in sys.stdin:
    n = int(line)
    if n == 0:
        break
    print("yes" if is_pal_num(n) else "no")
