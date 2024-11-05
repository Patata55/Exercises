units = int(input("hello enter your units of electrcity use: "))
aditionalUnits1 = float(units - 100)
aditionalUnits2 = float(units - 200)
aditionalUnits3 = float(units - 300)
total = float(0)
if units <= 100:
    print("The total you need to pay is", units, "$")
elif units >100 and units<=200:
    aditionalUnits1 = aditionalUnits1 * 1.5
    total = 100 + aditionalUnits1
    print("The total you need to pay is", total, "$")
elif units >200 and units<=300:
    aditionalUnits2 = aditionalUnits2 * 2
    total = 250 + aditionalUnits2
    print("The total you need to pay is", total, "$")
else:
    aditionalUnits3 = aditionalUnits3 * 3
    total = 450 + aditionalUnits3
    print("The total you need to pay is", total, "$")