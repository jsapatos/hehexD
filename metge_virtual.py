#! /usr/bin/env python
# encoding: utf-8

print "Per favor posin els seus simptomes separats amb una /, sense espais i exactament com posa la pregunta"
simp1=str(raw_input("Quins simptomes te? (esternuts/mal de cap/tos/cap dels simptomes anteriors) "))
if simp1 == "esternuts/mal de cap":
	simp2=str(raw_input("Te problemes d'estómac? (Si/No)"))
	if simp2 == "Si":
		print "Hauria de pendre paracetamol"
	else:
		print "Hauria de pendre àcid acetil salicílic (AAS)"
elif simp1 == "tos":
	simp3=str(raw_input("Es menor de 12 anys? (Si/No)"))
	if simp3 == "Si":
		print "Hauria de pendre un caramel de mel"
	else :
		print "Hauria de pendre un caramel d'eucaliptus"
elif simp1 == "cap dels simptomes anteriors":
	print "Hauria de venir a la meva consulta per poder examinar-lo"
else :
	print "No ha escrit un simptome posible"
