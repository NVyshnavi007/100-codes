l=[10,56,20,48,21,458,-1,0,569]
k=3
l.sort()
if len(l)<k:
    print("Invalid Input")
else:
    min=l[k-1]
    max=l[-k]
print(min,max)
