#! /usr/bin/env python
# encoding: utf-8

numero1=int(raw_input("Donem un nombre "))
operacio=str(raw_input("Operacio "))
numero2=int(raw_input("Donem un altre "))


if operacio == "+":
	solucio = numero1 + numero2
	print numero1 , operacio , numero2 , "és igual a" , solucio
elif operacio == "-":
	solucio = numero1 - numero2
	print numero1 , operacio , numero2 , "és igual a " , solucio
elif operacio == "*":
	solucio = numero1 * numero2
	print numero1 , operacio , numero2 , "és igual a " , solucio
elif operacio == "/":
	solucio = numero1 / numero2 
	print numero1 , operacio , numero2 , "és igual a " , solucio  
else:
	print " No has posat una operació correcte"
	
