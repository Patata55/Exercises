minutes = int(input("Hello enter the minutes in your phone: "))
extraMin1 = float(minutes-100)
extraMin2 = float(minutes-200)
extraMin3 = float(minutes-300)
total = float(0)
if minutes<= 100:
    total = 10
    print("The total you need to pay is", total, "$")
elif minutes<=200 and minutes>= 101:
    total = 10 + (extraMin1*0.5)
    print("The total you need to pay is", total, "$")
elif minutes<=300 and minutes>= 201:
    if minutes >= 250:
        total = 60 + (extraMin2*0.75) + 5
        print("The total you need to pay is", total, "$")
    else:
        total = 60 + (extraMin2*0.75)
        print("The total you need to pay is", total, "$")
else:
    total = 145 + extraMin3 + 5
    print("The total you need to pay is", total, "$")