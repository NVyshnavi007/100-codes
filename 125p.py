array = [1, 3, -1, 4, -3, -5, -6, 3, 7]

lst = []

for num in array:
    if num < 0:
        lst.append(num)

for num in array:
    if num >= 0:
        lst.append(num)

print(lst)