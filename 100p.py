from math import gcd

arr = [1, 2, 3, 4, 5, 6, 7]
k = 3

n = len(arr)
k = k % n

g = gcd(n, k)

for start in range(g):

    temp = arr[start]
    current = start

    while True:
        next_pos = (current + k) % n

        if next_pos == start:
            break

        arr[current] = arr[next_pos]
        current = next_pos

    arr[current] = temp

print(arr)