arr=list(map(int,input("enter numbers:").split()))
freq={}
for num in arr:
    freq[num]=freq.get(num,0)+1
print(freq)