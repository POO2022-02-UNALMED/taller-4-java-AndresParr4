package classroom;

public class Tipo {
	
	public enum tipo {
		DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
		
		Tipo tipo;
		private int codigo;
		private String nombre;
		
		tipo(int codigo) {
			
			this.codigo = codigo;
			//this.nombre = nombre;
		}
	
	}

	public static final Tipo FUNDAMENTACION = null;
	public static final Tipo DISCIPLINAR = null;

}

	
