
public class SegundoGrado {
	public static void main (String[]args){
		//declaramos dobles porque Math los ocupa
		double a=1,b=5,c=2,res;
		//usamos math.pow para obterner b^2, obtenido de stack overflow el tip
		res=(Math.pow(b,2)-4*(a*c))/2*a;
		//imprimimos el resultado
		System.out.println("El resultado es "+res);
		
	}
}
