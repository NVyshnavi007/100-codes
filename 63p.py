from itertools import permutations

sr = input("Enter a string: ")

for p in permutations(sr):
    print("".join(p))