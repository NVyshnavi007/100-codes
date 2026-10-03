arr = [-4, 1, 5, 2, -4, 4, 2]
total_sum=sum(arr)
left=0
for i,num in enumerate(arr):
    total_sum-=num
    if left==total_sum:
        print(i)
        break
    left+=num