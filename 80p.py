arr=list(map(int,input("enter numbers:").split()))
freq={}
for num in arr:
    freq[num]=freq.get(num,0)+1
lst=[]
while freq:
    max_freq = max(freq.values())

    for k, v in freq.items():
        if v == max_freq:
            lst.append(k)
            del freq[k]
            break

print(lst)