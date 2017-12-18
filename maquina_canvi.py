#!/usr/bin/env python
# coding: utf-8 -*-

#Maquina tragaperras
import random

print "                                BENVINGUT \n "
seguir=str(raw_input("                            Vol jugar ? (SI/NO) "))
while seguir == "si" or seguir == "SI":
	
	if seguir == "SI" or seguir == "si":
		

		num1 = random.randint(0,9)
		num2 = random.randint(0,9)
		num3 = random.randint(0,9)
		intents = random.randint(0,5)
		print "\n \n                                " , num1 , num2 , num3 , "  [" , intents , "]"
		while intents > 0:
			tirada=raw_input("\n\n  Tria quin nombre vols canviar dels 3 primers (1-2-3) o 0 per no més intents\n\n")
			if tirada == "1":
				num1 = random.randint(0,9)
				intents = intents - 1
				print "\n \n                                " , num1 , num2 , num3 , "  [" , intents , "]"
			elif tirada == "2":
				num2 = random.randint(0,9)
				intents = intents - 1
				print "\n \n                                " , num1 , num2 , num3 , "  [" , intents , "]"
			elif tirada == "3":
				num3 = random.randint(0,9)
				intents = intents - 1
				print "\n \n                                " , num1 , num2 , num3 , "  [" , intents , "]"
			elif tirada == "0":
				intents = 0
			else :
				print "			No ha posat ninguna opcio possible"
		if num1 == num2 and num2 == num3 :
			print "Ha guanyat 250 euros!!!"
			seguir=raw_input("Vol tornar a jugar? ")
		elif num1 == num2 or num1 == num3 or num2 == num3 :
			print "Ha guanyat 20 euros!"
			seguir=raw_input("Vol tornar a jugar? ")
		elif num1 == "7" or num3 == "7" :
			print "Ha guanyat 1 euro!"
			seguir=raw_input("Vol tornar a jugar? ")
		else :
			seguir=raw_input("Ha perdut, vol tornar a intentar-ho? ")
	else :
		print "hehe"
		
	
	



