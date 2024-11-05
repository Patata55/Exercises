income = float(input("Hello enter an income: "))
tax = float(0)
if income > 100000:
    tax = (income*30)/100
    print("The tax is", tax)
elif income <= 100000 and income >= 50000:
    tax = (income*20)/100
    print("The tax is", tax)
else:
    tax = (income*10)/100
    print("The tax is", tax)
print("Enter three sides of a triangle")
side1 = int(input("Side1: "))
side2 = int(input("Side2: "))
side3 = int(input("Side3: "))
if side1 == side2 and side2 == side3 and side3 == side1:
    print("It is an equilateral")
elif side1 == side2 or side2 == side3 or side3 == side1:
    print("It is an isosceles")
else:
    print("It is an scalene")