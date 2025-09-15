import sys

input = sys.stdin.readline
MOD = 1234567891
R = 31

L = int(input().strip())          
s = input().strip()               

h = 0                             
r_pow = 1                         

for ch in s:                      
    val = ord(ch) - 96            
    h = (h + val * r_pow) % MOD   # h += a_i * R^i  (모듈러 적용)
    r_pow = (r_pow * R) % MOD     # 다음 i = R^(i+1)

print(h)
