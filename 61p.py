def length(str):
    if str=="":
        return 0
    return 1+length(str[1:])
str=input("enter a string:")
print(length(str))