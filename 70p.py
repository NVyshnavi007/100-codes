st = input("Enter a string: ")

res = []

for ch in st:
    if res and res[-1] == ch:
        res.pop()
    else:
        res.append(ch)

print("".join(res))