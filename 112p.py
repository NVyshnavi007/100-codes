s=input("enter an equation:")
s1=""
for ch in s:
    if ch!=")" or ch!="(":
        s1+=ch
print(s1)