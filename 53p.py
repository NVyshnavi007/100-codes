Number=int(input("enter a number:"))
divisors=int(input("enter a number:"))
count1=0
for i in range(1,Number+1):
    count=0
    for j in range(1,i+1):
        if i%j==0:
            count+=1
    if count==divisors:
        count1+=1
print(count1)


    