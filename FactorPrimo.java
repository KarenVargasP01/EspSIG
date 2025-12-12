 import java.util.Scanner;
public class FactorPrimo {
        public static void main(String[] args) { 
		Scanner ingreso = new Scanner (System.in);
		System.out.println("Ingrese el numero a factorizar en primos: ");         
		int numero = ingreso.nextInt();
        descomponer(numero); 
    }

    public static void descomponer(int numero) {
        System.out.println("Factores primos de " + numero + ": ");


        while (numero % 2 == 0) {
            System.out.print(2 + " ");
            numero /= 2;
        }

        for (int i = 3; i * i <= numero; i += 2) { //los numeros primos exceptuando el 2 son impares por eso se buscan los impares y se valida su modulo

            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }

        if (numero > 2) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Salto de línea final
    }


}