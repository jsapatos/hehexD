#! /usr/bin/env python
# encoding: utf-8

# Programa que trobi la mitja de dos números naturals positius.
num=1
cont=0
acont=0
finalitzar="1"
if num!=0:
	while num!=0: #si introduim qualsevol numero que no sigui 0 es fa el bucle

		num=float(raw_input("Introdueix un número: ")) #demanam numero
		if num<0: #correció 1 si es menor que 0 dona error
			print "Numero incorrecte"
		elif num>0: #feim el contador
			cont=cont+num
			acont=acont+1
		

	else:
		if cont==0: #correció 2 si no hi ha cap numero dins el contador
			print "No has introduït cap número correcte"
		elif cont>0: #print final
			print "La mitjana és",cont/acont
