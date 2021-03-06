import java.util.Random;

public class BusquedaBaniaria {

	static int busquedaBinaria(int [] v,int k, int izq, int der)
	{
		//CASO BASE
		if(izq == der) {
			if(v[der]==k) {
				return der;
			}else {
				return -1;
			}
		}else {
			
			int medio = (der+izq)/2;
			if(v[medio]==k) {
				return medio;
			}else if(v[medio]<k) {
				return busquedaBinaria(v,k,medio+1,der);
			}else {
				return busquedaBinaria(v,k,izq,medio);
			}
		}
	}
	
	public static void main(String[] args)
	{
		int [] v = {2,5,8,16,23,38,56,72};
		Random r = new Random();
		int i = r.nextInt(v.length);
		int k = v[i];
		System.out.println("Para el indice "+i+" el elemento  "+k+" ocupa la posicion "+busquedaBinaria(v,k,0,v.length-1));
		
		
	}
}
