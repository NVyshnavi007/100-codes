arr=[0,1,2,0,2,1]
freq={}
for num in arr:
    freq[num]=freq.get(num,0)+1
lst=[]
for k,v in freq.items():
    lst.append(k*v)
print(lst)
