#! /usr/bin/env python
# encoding: utf-8

preu=int(raw_input("Preu total "))
pagat=int(raw_input("Quantitat que li han pagat "))

if preu > pagat:
	solucio = preu - pagat
	print "li falta pagar" , solucio , "€"
elif preu < pagat:
	solucio = pagat - preu
	print " Li ha de tornar " , solucio , "€"
else : 
	"El preu es exacte"
