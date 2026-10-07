S = 'GuDDuBHaiyA'
st=""
for ch in S:
    if ch.isupper():
        st+=ch.lower()
    else:
        st+=ch.upper()
print(f"{S} => {st}")