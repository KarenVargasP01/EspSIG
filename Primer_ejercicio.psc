Funcion sum<-pares ( n1 )
	d=n1
	Repetir
		d=d+1
		si d mod 2==0 entonces 
			sum=sum+d
			co=co+1
		FinSi
	Hasta Que co=n1
Fin Funcion


Algoritmo SumaPares
	escribir "inserte un numero"
	leer a
	imprimir "La suma de los ", a, " numero pares es: ", pares(a)
	
	
	
	
FinAlgoritmo
