plates = input().strip()
h = 10 

for i in range(1, len(plates)):
    if plates[i] == plates[i - 1]:
        h += 5
    else:
        h += 10

print(h)
