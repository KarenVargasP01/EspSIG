public class CuartoEj{
        public static void main(String args[]){
                 System.out.println("Bienvenido al cuarto ejercicio");
                 Vendedor ven1=new Vendedor("Camila Mendez",2,1200000);
                 Vendedor ven2=new Vendedor("Felipe Parra",4,2000000);
                 Vendedor ven3=new Vendedor("Gloria Perez",5,2500000);
                 Producto pd1=new Producto("Paquete algodon",50000,12);
                 Producto pd2=new Producto("Papas x 12",235000,30);
                 Producto pd3=new Producto("Rollos de papel",150000,11);
                 ven1.comision(5);
                 ven2.comision(11);
                 ven1.decada();
                 ven3.msjreconocimiento(6);
                 pd2.publicaprod(pd2.precio);
                 System.out.println("El predio unitario es: "+pd1.preciound(pd1.cant,pd1.precio));
        
               
        }
}  