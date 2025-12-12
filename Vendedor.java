public class Vendedor{
       String nombre;
       int aniosemp;//anios que lleva en la empresa
       long sueldo;
       
       Vendedor(String nombre, int aniosemp, long sueldo){
               this.nombre=nombre;
               this.aniosemp=aniosemp;
               this.sueldo=sueldo;
       }

       public void comision(int cantVenta){
               if(cantVenta>10){
                  sueldo=sueldo+500000;
                  System.out.println("Su sueldo mas comision es de: "+ sueldo);
               }else{
                  sueldo=sueldo+100000;
                  System.out.println("Ya que no se supero la meta, solo tienes la compensacion en gastos para un total de: "+sueldo);
               }
       }

 public void decada(){
               int c=0;
               for (int i=aniosemp;i<=10;i++){
                    c=c+1;
               }
               System.out.println("Te quedan "+ c +" para cumplir 10 anios en la empresa");
                     
}
       public void msjreconocimiento(int aniosemp){
              if(aniosemp>5){
                 System.out.println("Querido "+nombre+" debido a tu fidelidad, ganaste 2 dias de descanso. Felicidades");
              }else{
              System.out.println("Querido "+nombre+" esperamos que sigas creciendo con nosotros. Gracias");

       }
}
}