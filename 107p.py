string=input("enter a string:")
vowels="aeiouAEIOU"
res=""
for ch in string:
    if ch not in vowels:
        res+=ch
print(res)

