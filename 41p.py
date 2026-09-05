n = int(input("enter total number of students: "))

r = int(input("no. of seats available in class: "))

a = n - r

m1 = 1
m2 = 1

for i in range(1, n + 1):
    m1 *= i

for j in range(1, a + 1):
    m2 *= j

m3 = m1 // m2

print(m3)