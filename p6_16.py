#! /usr/bin/env python
# encoding: utf-8

import math

a=float(raw_input("Introdueix la A: "))
b=float(raw_input("Introdueix la B: "))
c=float(raw_input("Introdueix la C: "))

if a==0:
	print "Error a la divisió"
	
else:
	aux=b**2-4*a*c
	if aux<0:
		print "Solució imaginaria"
	else:
			print "La primera solució es: ", (-b+math.sqrt(aux))/(2*a)
			print "La segona solució es: ", (-b-math.sqrt(aux))/(2*a)
