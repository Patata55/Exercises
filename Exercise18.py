BMI = float(input("Hello enter your BMI: "))
if BMI < 18.5:
    print("You are underweight")
elif 18.5 <= BMI and BMI <= 24.9:
    print("You have a normal weight")
elif 25 <= BMI and BMI <= 29.9:
    print("You are overweight")
else:
    print("You are obese")