Funcion sn<-bisiesto(a)
	
	si a mod 4==0 Entonces
		si a mod 100=0 entonces 
			si a mod 400=0 entonces
				sn=1
			FinSi
			sn=0
			
		finsi
		sn=1
		
	SiNo
		sn=0

	FinSi
	
		
	
	
Fin Funcion

Algoritmo prueba
	
	
		Escribir "Ingrese el dia: "
		leer d
		
		Si d>=32 O d<=0
				Escribir "El dia no es valido: "
			sino 
				Escribir "ingrese el mes en numero: "
				leer m 
				
				Si m>12 O m<=0
					Escribir "El mes no es valido: "
					
				sino 
					si (m=4 O m=6 O m=9 O m=11) Y d>30 Entonces
							Escribir "El mes elegido solo tiene 30 dias: "
							
						sino 
							si m=2 Y d>29 Entonces
								
									Escribir "El mes elegido tiene max 29 dias : "
							FinSi
								
						FinSi
					FinSi
				FinSi
				Escribir "ingrese el anio"
				leer a
				
				si a<=0 Entonces
					escribir "El anio no es correcto"
				SiNo
					si m=2 Y d=29 Entonces
						
						c= bisiesto(a)
						
						si c=1 Entonces
							imprimir "la fecha es ", d," de febrero de ",a
							
							
						sino 
								imprimir "el anio no es bisiesto, por ende no puede tener 29 dias en febrero"
						
						FinSi
						
					sino 
						si m=1 Entonces
							imprimir "la fecha es ", d," de enero de ",a
						FinSi
						
						si m=2 Entonces
							imprimir "la fecha es ", d," de febrero de ",a
						FinSi
						
						si m=3 Entonces
							imprimir "la fecha es ", d," de marzo de ",a
						FinSi
						
						si m=4 Entonces
							imprimir "la fecha es ", d," de abril de ",a
						FinSi
						
						si m=5 Entonces
							imprimir "la fecha es ", d," de mayo de ",a
						FinSi
						
						si m=6 Entonces
							imprimir "la fecha es ", d," de junio de ",a
						FinSi
						
						si m=7 Entonces
							imprimir "la fecha es ", d," de julio de ",a
						FinSi
						
						si m=8 Entonces
							imprimir "la fecha es ", d," de agosto de ",a
						FinSi
						
						si m=9 Entonces
							imprimir "la fecha es ", d," de septiembre de ",a
						FinSi
						
						si m=10 Entonces
							imprimir "la fecha es ", d," de octubre de ",a
						FinSi
						
						si m=11 Entonces
							imprimir "la fecha es ", d," de noviembre de ",a
						FinSi
						
						si m=12 Entonces
							imprimir "la fecha es ", d," de diciembre de ",a
						FinSi
						
					FinSi
					
				FinSi
				
					
					
					
				
			
				//Escribir "ingrese el anio: "
				//leer a 
			

							
			    
			
		
	
FinAlgoritmo
