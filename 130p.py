art=list(int,input("enter numbers:").split())
freq={}
for num in art:
    freq[num]=freq.get(num,0)+1
for n in freq:
    if freq[n]>1:
        print(f"{n} occurs {freq[n]} times")
