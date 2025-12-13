import java.util.Scanner;
public class Matrizp{
	public static void main(String[] args){
		Scanner ingreso = new Scanner(System.in);
		int arreglo[][][]= new int[3][3][3];
		int max[]=new int[4];
		int min[]=new int[4];
		int promedio[]=new int[4];
		for(int x=0;x<arreglo.length;x++){
			for(int y=0;y<arreglo[x].length;y++){
                            for(int z=0;z<arreglo[x][y].length;z++){
				System.out.println("ingrese la pos en X="+x+" Y="+y+" Z="+z);
				arreglo[x][y][z]=ingreso.nextInt();
 		             } 
			}
		}

                max[0]=arreglo[0][0][0];
		min[0]=arreglo[0][0][0];
		max[1]=arreglo[0][2][0];
		min[1]=arreglo[0][2][0];
		max[2]=arreglo[0][2][2];
		min[2]=arreglo[0][2][2];
		max[3]=arreglo[2][2][0];
		min[3]=arreglo[2][2][0];

                for(int x=0;x<arreglo.length;x++){
			for(int y=0;y<arreglo[x].length;y++){
                                for(int z=0;y<arreglo[x][y].length;z++){
				        if(x==y){
					        if(max[0]<arreglo[x][y][z]){
						max[0]=arreglo[x][y][z];
					}
					        if(min[0]>arreglo[x][y][z]){
						min[0]=arreglo[x][y][z];
					}
					        promedio[0]=promedio[0]+arreglo[x][y][z];
				        }
				        if(y==z){
					        if(max[1]<arreglo[x][y][z]){
						max[1]=arreglo[x][y][z];
					}
					        if(min[1]>arreglo[x][y][z]){
						min[1]=arreglo[x][y][z];
					}
					        promedio[1]=promedio[1]+arreglo[x][y][z];
				        }
				        if(x==y && y==z){
					        if(max[2]<arreglo[x][y][z]){
						max[2]=arreglo[x][y][z];
					}
					        if(min[2]>arreglo[x][y][z]){
						min[2]=arreglo[x][y][z];
					}
					        promedio[2]=promedio[2]+arreglo[x][y][z];
				        }
				        if(x!=y && y!=z){
					        if(max[3]<arreglo[x][y][z]){
						max[3]=arreglo[x][y][z];
					}
					        if(min[3]>arreglo[x][y][z]){
						min[3]=arreglo[x][y][z];
					}
					        promedio[3]=promedio[3]+arreglo[x][y][z];
				        }
                                 }		
			}
		}
		promedio[0]=promedio[0]/3;
		promedio[1]=promedio[1]/3;
		promedio[2]=promedio[2]/3;
		promedio[3]=promedio[3]/3;
                for(int i=0;i<3;i++){
			System.out.println("Para la i="+i+" es max:"+max[i]+" min:"+min[i]+" prom:"+promedio[i]);
		}
         }
}