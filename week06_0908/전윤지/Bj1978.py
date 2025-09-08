import sys

def is_prime(n):
    if n < 2:  
        return False
    for i in range(2, int(n**0.5) + 1):  
        if n % i == 0:
            return False
    return True

N = int(sys.stdin.readline().strip())
nums = list(map(int, sys.stdin.readline().split()))

count = 0
for x in nums:
    if is_prime(x):
        count += 1

print(count)
