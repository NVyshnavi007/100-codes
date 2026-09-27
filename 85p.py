arr=list(map(int,input("emter numbers:").split()))
freq={}
for num in arr:
    freq[num]=freq.get(num,0)+1
for k,v in freq.items():
    if v>1:
        arr.remove(k)
print(arr)