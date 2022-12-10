public class CFactura {
		private String NumPieza;
		private String DesPieza;
		private int CanPieza;
		private double PrecioUnit;
		
	//Metodos de obtencion de variables
	public String ObtenNumPieza(){
		return NumPieza;
	}

	public String ObtenDesPieza(){
		return DesPieza;
	}
	
	public int ObtenCanPieza(){
		return CanPieza;
	}
	
	public double ObtenPrecioU(){
		return PrecioUnit;
	}
	
	public void ObtenImporte(double importe){
		if (PrecioUnit>0 && CanPieza>0){
			importe=((double)PrecioUnit*CanPieza);
		} else {
			System.out.println ("Falta informacion para dar el importe");
			return;
		}
	}
	
	
	//metodos de asignacion
	public void AsignaDesPza (String nom){
		if (nom.length()==0){
			System.out.println("Error, cadena vacia");
		}
		DesPieza=nom;
	}
	
	public void AsignaNumPza (String nom){
		if (nom.length()==0){
			System.out.println("Error, cadena vacia");
			return;
		}
		NumPieza=nom;
	}
	
	public void AsignaCanPza(int cantidad){
		if (cantidad<=0){
			System.out.println("Falta agregar articulos");
			return;
		}
		CanPieza+=cantidad;
	}
	public void AsignaPrecioU(double cantidad){
		if (cantidad<=0){
			System.out.println("Error, no tiene valor el precio unitario");
			return;
		}
		PrecioUnit=cantidad;
		}

	}