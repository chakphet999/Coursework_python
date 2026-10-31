txt = input()
new = txt.split(' ')
cou = {}
n = 0
for word in new:
    if word in txt:
        cou[word] = cou.get(word,0) + 1 
for j,k in cou.items():
    if k>1:
        print(f'{j}: {k}')
        n += 1
if n == 0:
    print('no duplicated word')
    
