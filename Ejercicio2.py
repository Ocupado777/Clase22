darck = 0

A = int(input("Ingrese el número de notas: "))

stotal = []

for i in range(1, A + 1):
    temp = float(input("Ingrese las notas: "))
    stotal.append(temp)
    darck += temp

media = darck / A

if 90 <= media <= 100:
    print("A")
elif 80 <= media <= 90:
    print("B")
elif 70 <= media <= 80:
    print("C")
elif 60 <= media < 70:
    print("D")
else:
    print("E")