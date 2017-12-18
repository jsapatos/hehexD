#! /usr/bin/env python
# encoding: utf-8
# Programa que fer una calculadora senzilla amb possibilitat de tornar a calcular

decisio = "si"
while decisio=="Si" or decisio=="si":

	num1 = int(raw_input("Introdueix el primer nombre: "))

	operand = str(raw_input("Introdueix l'operand: "))

	num2 = int(raw_input("Introdueix el segon nombre: "))

	
	if operand=="+": 
		print num1+num2
	elif operand=="-":
		print num1-num2
	elif operand=="*":
		print num1*num2
	elif operand=="/":
		if num2==0:
			print"SYNTAX ERROR"
		else:
			print num1/num2
	else:
		print "Operació incorrecta, canvía l'operand"
	decisio = str(raw_input("Vols continuar?"))
	
