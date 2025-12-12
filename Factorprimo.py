


def descomponerEnPrimos(numero):
    print("Factores primos de " + str(numero) + ": ")
    while numero % 2 == 0 :
        print(str(2) + " ");
        numero /= 2;
        
    i = 3
        
    while i * i <= numero:
        while numero % i == 0: 
            print(str(i) + " ");
            numero /= i;
        i = i+2;
        

    if (numero > 2) :
         print(str(int(numero)) + " ");
        
    print(); 
    
        
        
        
        

print("Sistema de factores primos: ");
numero= int(input("Ingrese el numero a factorizar en primos: "));


descomponerEnPrimos(numero)



