s=input("enter a string:")
st="aeiouAEIOU"
count=0
for ch in s:
    if ch in st:
        count+=1
print("number of vowels in the string is:",count)
