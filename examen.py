#!/usr/bin/env python
# encoding: utf-8 
#Programa que agafa nombres negatius i positius, els separa i fa la suma entre els negatius i entre els positius
nombre=1		#Per tenir una base de ont partir(Despres el substitueix quan li deman a l'usuari)
cont_pos=0		#Contador positius
cont_neg=0		#Contador negatius
nombrepos=0		#Suma total positius
nombreneg=0		#SUma total negatius
while nombre<0 or nombre>0:								#Si no és 0 que segueixi
	nombre=int(raw_input("Introdueix un numero: "))
	if nombre>0:										#Si és positiu que sumi al contador i sumi al total
		nombrepos=nombrepos+nombre
		cont_pos=cont_pos+1
	elif nombre<0:										#Si és negatiu que sumi al contador i que sumi al total
		nombreneg=nombreneg+nombre
		cont_neg=cont_neg+1
print "Has introduit",cont_neg,"números negatius, i el sumatori és",nombreneg
print "Has introduit",cont_pos,"números positiys, i el sumatori és",nombrepos
	

	

