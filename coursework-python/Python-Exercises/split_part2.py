n = input()
a = n.split(',')
if a[2] == 'dead' or a[2] == '-':
    print('invalid input')
else:
    print(f'{a[1]}, {a[0]} is a {a[3]} student and is {a[2]} years old.')
