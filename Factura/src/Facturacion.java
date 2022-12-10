public class Facturacion {
	public static void main (String[]args){
		//generacion de objeto1
		CFactura pieza1=new CFactura();
		pieza1.AsignaDesPza("Rotor");
		pieza1.AsignaNumPza("1h23");
		pieza1.AsignaCanPza(10);
		pieza1.AsignaPrecioU(15);
		//generacion de objeto2
		CFactura pieza2=new CFactura();
		pieza2.AsignaDesPza("Flecha");
		pieza2.AsignaNumPza("1h24");
		pieza2.AsignaCanPza(1);
		pieza2.AsignaPrecioU(1523);
		System.out.println(pieza1.ObtenNumPieza());
		System.out.println(pieza1.ObtenDesPieza());
		System.out.println(pieza1.ObtenCanPieza());
		System.out.println(pieza1.ObtenPrecioU());
		System.out.println(pieza2.ObtenNumPieza());
		System.out.println(pieza2.ObtenDesPieza());
		System.out.println(pieza2.ObtenCanPieza());
		System.out.println(pieza2.ObtenPrecioU());
			
	}
}
