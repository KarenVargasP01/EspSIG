Funcion num <- adivina (b)
	
a= Aleatorio(1,50)
co=1
//imprimir a 

mientras b<0 O b>50 hacer
	imprimir "El numero no cumple con las condiciones, escriba otro por favor"
	leer b
FinMientras
	
Si b<>a Entonces
	Repetir
		//Para i=2 Hasta 5 Con Paso 1 Hacer
		si b>a entonces 
			mientras b<0 O b>50 hacer
				imprimir "El numero no cumple con las condiciones, escriba otro por favor"
				leer b
			FinMientras
			co=co+1
			imprimir "El numero es menor, intente nuevamente"
			leer b
			
		FinSi
		si b<a entonces 
			mientras b<0 O b>50 hacer
				imprimir "El numero no cumple con las condiciones, escriba otro por favor"
				leer b
			FinMientras
			co=co+1
			imprimir "El numero es mayor, intente nuevamente"
			leer b
			
		FinSi
		si a=b Entonces
			co=co+1
		FinSi
			//Fin Para
	Hasta Que co>=5
		
	si b=a Entonces
		imprimir "Ha adivinado el numero. Felicitaciones!"
			
	SiNo
		imprimir 'No has adivinado el numero, era: " ,a
	FinSi
	
sino 
	imprimir "Ha adivinado el numero. Felicitaciones!"
	
FinSi	
Fin Funcion

Algoritmo adivinador
	
	Escribir "Se va a elegir un valor entre 1 y 50 y la idea es que adivine cual es. Ingrese primer intento"
	leer c
	imprimir adivina(c)
	
	
FinAlgoritmo
