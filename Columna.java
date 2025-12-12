public class Columna{
	public static void main(String args[]) {
	    int num = 100;
	    if(num>0){
            System.out.println("Columna1 | Columna2");
	    for(int i=1;i<=num;i++){
	        System.out.println( i+"       | "+(num-i+1));
	    }
	       
	    }else{
	        System.out.println("Numero debe ser positivo");
	    }
	}

}