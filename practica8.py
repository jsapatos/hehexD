#! /usr/bin/env python
# encoding: utf-8

# Programa que doni els primers 100 naturals en ordre
i = 0

nombre1=int(raw_input("Introduieix el primer nombre: "))
nombre2=int(raw_input("Introdueix el segon nombre: "))

for i in range (nombre1+1,nombre2,1):
	print i

