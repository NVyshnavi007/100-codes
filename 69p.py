arr = [1, 2, 3]

subsets = [[]]

for num in arr:
    new_subsets = []

    for sub in subsets:
        new_subsets.append(sub + [num])

    subsets += new_subsets

print(subsets)