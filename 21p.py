n1=int(input("enter a number:"))
n2=int(input("enter end range: "))
lst=[]
for i in range(n1,n2+1):
    if i>1:
        for j in range(2,i):
            if (i%j)==0:
                break
        else:
            lst.append(i)
print(lst)
                
        