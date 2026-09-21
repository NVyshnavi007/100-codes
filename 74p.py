arr=list(map(int,input("enter numbers:").split()))
a=list(set(arr))
a.sort()
print(a[1])