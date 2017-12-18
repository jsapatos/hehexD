#! /usr/bin/env python
# encoding: utf-8

# Programa un ascensor d'un edifici amb planta baixa i dos pisos que tingui els següents botons: ‘pujar 1’, ‘pujar 2’, ‘baixar 1’ i ‘baixar 2’.

pisa=int(raw_input("A quin pis et trobes? (+1, +2, -1, -2) ")) #pis on es troba



if pisa==0: #condició
	mov=str(raw_input("Es troba a la planta baixa, on vol anar? ")) #deixà seleccionar a l'usuari la direccio on vol anar
	if mov=="+1":
		pisa=1
		print "Es troba a la primera planta, on vol anar? "
	elif mov=="+2":
		pisa=2
		print"Es troba a la segona planta, on vol anar? "
	else:
		print "Error, no hi ha pis disponible"
elif pisa==1:
	mov=str(raw_input("Es troba a la priemra planta, on vol anar? "))
	if mov=="+1":
		pisa=2
		print "Es troba a la segona planta, on vol anar? "
	elif mov=="-1":
		pisa=2
		print"Es troba a la planta baixa, on vol anar? "
	else:
		print "Error, no hi ha pis disponible"
elif pisa==2:
	mov=str(raw_input("Es troba a la segona planta, on vol anar? "))
	if mov=="-1":
		pisa=2
		print "Es troba a la primera planta, on vol anar? "
	elif mov=="-2":
		pisa=2
		print"Es troba a la planta baixa, on vol anar? "
	else:
		print "Error, no hi ha pis disponible"
