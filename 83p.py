arr=list(map(int,input("enter numbers:").split()))
freq={}
for num in arr:
    freq[num]=freq.get(num,0)+1
for k,v in freq.items():
    if v==1:
        print(k)