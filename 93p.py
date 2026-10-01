arr=[50,100,75]
n=len(arr)
for i in range(len(arr)):
    while arr[i]%2==0:
        arr[i]=arr[i]//2
    while arr[i]%3==0:
        arr[i]=arr[i]//3
if arr[i]!=arr[0]:
    print("False")
else:
    print("True")