
# YOUR CODE HERE
member = input()
size = input()
topping = input()
price = 40
if size == 'L':
    a=price+10
elif size == 'M':
    a=price 
if topping == 'Y':
    a=a+10
elif topping =='N':
    a=a
if member =='Y':
    a=a-(a*0.1)
elif member == 'N':
    a=a
print('Total price:',float(a))


