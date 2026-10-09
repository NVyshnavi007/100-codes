s=input("enter a string:")
s1=""
for ch in s:
    if ch.isalpha():
        s1+=ch
print(s1)