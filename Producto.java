public class Producto{
       String nombre_pro;
       int precio;
       int cant;
       
       Producto(String nombre_pro, int precio, int cant){
               this.nombre_pro=nombre_pro;
               this.precio=precio;
               this.cant=cant;
       }

       public int preciound(int cant, int precio){
               int valorund;
               if(cant>0 && precio>0){
                  return valorund=precio/cant;
                  
               }else{
                  System.out.println("Los numeros no son validos");
                  return 0;
               }
               
       }

       public void publicaprod(int precio){
               int c=0;
               while(precio>200000 && cant>20){
                    precio=precio-10000;
                    c=c+1;
               }

               System.out.println("Se le bajo "+ c +" veces el valor al producto");
                     
        }       

 }