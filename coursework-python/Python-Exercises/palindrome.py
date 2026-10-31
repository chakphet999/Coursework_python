
# Your Python code goes here

n = input()
txt = n.lower()
a = ''
for i in txt:
    if i>='a' and i<='z':
        a += i

if a == a[::-1]:
    print('palindrome')
else:
    print('not palindrome')
