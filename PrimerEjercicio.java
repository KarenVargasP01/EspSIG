 import java.util.Scanner;
	public class PrimerEjercicio{

		  public static void main(String args[]) {

			 Scanner ingreso = new Scanner (System.in);
				 System.out.println("Ingrese el primer numero: ");         
				 int num1 = ingreso.nextInt();
	
			System.out.println("Ingrese el segundo numero: "); 	    
int num2 = ingreso.nextInt();

				if(num1>0 && num2>0){
	 PrimerEjercicio obj1 = new PrimerEjercicio();

				 obj1.factorial(num1);

			System.out.println("Permutacion de P("+num1+","+num2+") es "+ obj1.permutacion(num1,num2));

			System.out.println("Combinacion de C("+num1+","+num2+") es "+obj1.combinacion(num1,num2));

			}

			else{

				   System.out.println("Ambos numeros deben ser positivo");

			}

	}
	
		

		public long combinacion(int num1, int num2){
                                      
		   return factorial(num1)/(factorial(num2)*(factorial(num1-num2)));

	}
	

		public long permutacion(int num1, int num2){

		   return factorial(num1)/factorial(num1-num2);

		}

		

		public long factorial (int n){
		int factor=1;
	
			for (int i = 1; i <= n; i++) {
	
					factor = i*factor; 
				 }
	
			 return factor;
	
		}
	}
	
	
	
	
	
	