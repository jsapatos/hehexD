#! /usr/bin/env python
# encoding: utf-8

print "Per favor posin el color exactament com posa la pregunta"
color1=str(raw_input("De quin color es el semafor? (verd/groc/vermell) "))

if color1 == "verd":
	print "Has de passar"
elif color1 == "groc":
	print "Has de córrer"
elif color1 == "vermell":
	print "Has de esperar"
else :
	print "No has escrit un color correcte"
	
