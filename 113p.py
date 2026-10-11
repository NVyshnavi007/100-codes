s=input("enter a string:")
res=0
for ch in s:
    if ch.isdigit():
        res+=int(ch)
print("The sum of digits in the string is:", res)