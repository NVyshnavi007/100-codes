def block_swap(arr, start, k, n):
    # k = size of A
    # n = size of the remaining array

    if k == 0 or k == n:
        return

    if k == n - k:
        for i in range(k):
            arr[start + i], arr[start + k + i] = \
                arr[start + k + i], arr[start + i]

    elif k < n - k:
        for i in range(k):
            arr[start + i], arr[start + n - k + i] = \
                arr[start + n - k + i], arr[start + i]

        block_swap(arr, start, k, n - k)

    else:
        for i in range(n - k):
            arr[start + i], arr[start + k + i] = \
                arr[start + k + i], arr[start + i]

        block_swap(arr, start + n - k, 2 * k - n, k)


arr = [1, 2, 3, 4, 5, 6, 7]
k = 3

block_swap(arr, 0, k, len(arr))

print(arr)