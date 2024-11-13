num = int(input("Hello enter a number"))
count = int(0)
multiply = int(1)
while count < num:
    multiply = multiply *(num - count)
    count = count + 1
print(multiply)