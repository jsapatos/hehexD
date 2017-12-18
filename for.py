#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Programa que agafa nombre i li suma 1, despres diu quantes xifres te el nombre total
nombre=int(raw_input("Introdueix un numero: "))
nombre=nombre+1				#la suma
contador=0
while nombre>0:				#Conta les vegades que tarda per ser més petit que 0
	nombre=nombre/10		
	contador=contador+1
print "La suma té",contador,"xifres"

		
