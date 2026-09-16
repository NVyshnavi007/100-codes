n = int(input("Enter N: "))

num = 1
total = 0

for i in range(1, n + 1):
    product = 1

    for j in range(i):
        product *= num
        num += 1

    total += product

print(total)