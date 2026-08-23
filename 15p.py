num1 = int(input("Enter start range: "))
num2 = int(input("Enter end range: "))

lst = []

for i in range(num1, num2 + 1):

    num = i
    n = len(str(num))
    sum = 0
    temp = num

    while temp > 0:
        digit = temp % 10
        sum = sum + digit ** n
        temp = temp // 10

    if num == sum:
        lst.append(num)

print(lst)