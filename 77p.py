arr = list(map(int, input("enter numbers: ").split()))

mid = len(arr) // 2

left = sorted(arr[:mid])
right = sorted(arr[mid:], reverse=True)

arr = left + right

print(arr)