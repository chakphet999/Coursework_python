txt = input()
new = ''
for i in txt:
    if i.isalnum():
        new += i
if len(new)>0:
    print(new)
else:
    print('empty')
