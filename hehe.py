#!/usr/bin/env python
# encoding: utf-8 
#Programa que converteix la primera lletra de cada paraula en majuscula
seguir="si"
while seguir=="si":
	cont=0
	espai=0
	resultado=""
	st=str(raw_input("Donem un text "))
	for i in st:
		if cont==0:
			i=i.upper()
			resultado=resultado+i
			cont=cont+1
		elif espai==1:
			i=i.upper()
			resultado=resultado+i
			espai=espai-1
		elif i==" ":
			espai=espai+1
			resultado=resultado+i
		else :
			resultado=resultado+i
	print resultado
		
	seguir=str(raw_input("Vols seguir? "))
	seguir=seguir.lower()
