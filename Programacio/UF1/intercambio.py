#Programa para intercambiar dos variables sin una tercera
print "Escribe tu numero"
A = int(raw_input())

print "Escribe tu segundo numero"
B = int(raw_input())


A=A+B
B=A-B
A=A-B

print "El primer numero es:"
print A
print "El segundo numero es:"
print B
