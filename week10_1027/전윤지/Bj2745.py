n, b = input().split()
b = int(b)

ans = 0
for i, ch in enumerate(reversed(n)):
    if ch.isdigit():
        val = int(ch)
    else:
        val = ord(ch) - 55
    ans += val * (b ** i)
print(ans)
