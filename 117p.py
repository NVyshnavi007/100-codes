str1=input("enter a string:")
str2=input("enter a string:")
str1=sorted(str1.lower())
str2=sorted(str2.lower())
if str1==str2:
    print("the strings are anagrams")
else:
    print("the strings are not anagrams")