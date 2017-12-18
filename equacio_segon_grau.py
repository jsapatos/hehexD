#! /usr/bin/env python
# encoding: utf-8

#Suma 1 segon a la data que ens dona

dia=int(raw_input("Donem un dia DD "))
mes=int(raw_input("Donem un mes MM "))
year=int(raw_input("Donem un any AAAA "))
hora=int(raw_input("Donem una hora HH "))
mint=int(raw_input("Donem un minut MnMn "))
seg=int(raw_input("Donem un segon SS "))
#si el client posa 59 hem de sumar 1 minut i hem de anar alerta que no sigui 59 minuts
if seg < 0 or seg > 59:
	print "Error"
elif mint < 0 or mint > 59:
	print "Error"
elif hora < 0 or hora > 23:
	print "Error"
elif dia < 0 or mes >  29:
	print "Error"
elif mes < 0 or mes > 12:
	print "Error"
# He de arreglar que no segueixi despues de donar error hehe
if seg + 1 == 60:
	seg = 0
	mint = mint + 1
	if mint == 60:
		mint = 0
		hora = hora + 1
		if hora == 24:
			hora = 0
			dia = dia +1
			if dia == 30:
				dia = 1
				mes = mes +1
				if mes == 13:
					mes = 1
					year = year +1 
					print dia , mes , year , hora , mint , seg
				else: 
					print  dia , mes , year , hora , mint , seg
			else :
				print  dia , mes , year , hora , mint , seg
		else:
			print  dia , mes , year , hora , mint , seg
	else:
		print  dia , mes , year , hora , mint , seg
else:
	print  dia , mes , year , hora , mint , seg
