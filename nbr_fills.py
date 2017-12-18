#! /usr/bin/env python
# encoding: utf-8

fills=int(raw_input("Quants de fills te? "))

if fills < 0:
	print "error, no pots tenir menys que 0 fills!"
elif fills == 0 :
	print "tot el que t'has estalviat en bolquers!"
elif fills == 1 :
	print "compte de no mimar-lo massa!"
elif fills >1 and fills <5 :
	print "no t'avorreixes a casa eh?"
elif fills > 4 :
	print "tu sí fas país!"
else :
	print "Has de posar un nombre!"
