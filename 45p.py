num = int(input("enter a number: "))

lst = []

for i in range(2, num):
    count = 0

    for j in range(1, i + 1):
        if i % j == 0:
            count += 1

    if count == 2:
        lst.append(i)

for i in range(len(lst)):
    for j in range(i + 1, len(lst)):
        if lst[i] + lst[j] == num:
            print(lst[i], lst[j])