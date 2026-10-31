txt1 = input()
txt = txt1.lower()
vowel = 'a','e','i','o','u'

for i in vowel:
    b = txt.count(i)
    print(f'{i}: {b}')


        
