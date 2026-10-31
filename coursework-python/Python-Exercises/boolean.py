
# YOUR CODE HERE
a = float(input())
b = float(input())
c = float(input())
if a+b>c and a+c>b and b+c>a:
    print('Valid triangle')
    if a==b==c:
        print('Equilateral')
    elif a==b or a==c or b==c:
        print('Isosceles')
    elif a != b and a != c and b != c:
        print('Scalene')
else:
    print('Invalid triangle')

