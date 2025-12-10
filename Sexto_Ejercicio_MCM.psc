Funcion m <- MCM ( a,b )
	
	mul=a*b
	si a>b Entonces
		divi=a
		ds=b
	SiNo
		si a<b Entonces
			ds=a
			divi=b
			
		FinSi
	FinSi
	
	resi=divi mod ds
	
	Mientras resi <> 0 Hacer
		
		aux=ds
		ds=resi
		divi=aux
		resi=divi mod ds
		
	Fin Mientras
	
	m=mul/ds
	
	
	imprimir "ingrese el siguiente numero: "
	leer c
	
	si c>0 entonces
	
		Repetir
			a=c
			b=m
			
			si a>b Entonces
				divi=a
				ds=b
			SiNo
				si a<b Entonces
					ds=a
					divi=b
					
				FinSi
			FinSi
			
			resi=divi mod ds
			
			Mientras resi <> 0 Hacer
				
				aux=ds
				ds=resi
				divi=aux
				resi=divi mod ds
				
			FinMientras
			
			m=(m*c)/ds
			
			imprimir "ingrese el siguiente valor: "
			leer c
			
		Hasta Que c<=0
	FinSi
	
	
	//imprimir "el mcm es :", m
	
Fin Funcion

Algoritmo MinComunMul
	
	imprimir "ingrese 1mer numero: "
	leer a
	
	Repetir
		si a<0 Entonces
			escribir "el numero no es valido, ingrese un numero positivo: "
			leer a
		FinSi
	Hasta Que a>0
	
	imprimir "ingrese 2do numero: "
	leer b
	
	
	Repetir 
		si b<0 Entonces
			escribir "el numero no es valido, ingrese un numero positivo: "
			leer b
		FinSi
	Hasta Que b>0
	
	Imprimir MCM(a,b)
	
FinAlgoritmo
