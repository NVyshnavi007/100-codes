num1=int(input("enter a number:"))
num2=int(input("enter another number:"))
s1=0
s2=0
for i in range(1,num1):
    if num1%i==0:
        s1+=i

for i in range(1,num2):
    if num2%i==0:
        s2+=i

c1=s1/num1
c2=s2/num2
if c1==c2:
    print( "They are friendly pairs")
else:
    print("Not friendly pairs")
