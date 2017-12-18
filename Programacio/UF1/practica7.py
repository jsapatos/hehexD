#! /usr/bin/env python
# encoding: utf-8

# Programa una màquina expendedora de monedes

diners=float(raw_input("Introdueix la quantitat de diners: "))
e500=0
e200=0
e100=0
e50=0
e20=0
e10=0
e5=0
e2=0
e1=0
e05=0
e02=0
e01=0
e005=0
e002=0
e001=0

while diners>=500:
	e500=e500+1
	diners=diners-500
	
while diners>=200:
	e200=e200+1
	diners=diners-200

while diners>=100:
	e100=e100+1
	diners=diners-100

while diners>=50:
	e50=e50+1
	diners=diners-50

while diners>=20:
	e20=e20+1
	diners=diners-20

while diners>=10:
	e10=e10+1
	diners=diners-10

while diners>=5:
	e5=e5+1
	diners=diners-5

while diners>=2:
	e2=e2+1
	diners=diners-2

while diners>=1:
	e1=e1+1
	diners=diners-1

while diners>=0.50:
	e05=e05+1
	diners=diners-0.50

while diners>=0.20:
	e02=e02+1
	diners=diners-0.20

while diners>=0.10:
	e01=e01+1
	diners=diners-0.10

while diners>=0.05:
	e005=e005+1
	diners=diners-0.05

while diners>=0.02:
	e002=e002+1
	diners=diners-0.02

while diners>=0.01:
	e001=e001+1
	diners=diners-0.01

print e500, "Billet/s de 500"
print e200, "Billet/s de 200"
print e100, "Billet/s de 100"
print e50, "Billet/s de 50"
print e20, "Billet/s de 20"
print e10, "Billet/s de 10"
print e5, "Billet/s de 5"
print e2, "Moneda/es de 5"
print e1, "Moneda/es de 5"
print e05, "Moneda/es de 5"
print e02, "Moneda/es de 5"
print e01, "Moneda/es de 5"
print e005, "Moneda/es de 5"
print e002, "Moneda/es de 5"
print e001, "Moneda/es de 5"

