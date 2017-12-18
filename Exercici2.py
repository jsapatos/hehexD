#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Programa que agafa nombre i li suma 1, despres diu quantes xifres te el nombre total
t=[]
p=[]
num=int(raw_input("Introdueix un numero: "))
num2=int(raw_input("Introdueix un altre numero: "))
for i in range(10):
	t.append(num)
	p.append(num2)
	num=num+1
	num2=num2+1
for i in t:
	print i,
for i in p:
	print i,
[x + y for x, y in zip(t,p)

