public class SegundoEjercicio{
    
    public static void asterisco(int a) {          
           for(int b=1;b<a;b++){
             System.out.println("*");
               for(int c=1;c<=b;c++){
                  System.out.print("**");
              } 
           }
    }

    public static void main(String[] args){
        int a=5;
        asterisco(a);
      
    }
}