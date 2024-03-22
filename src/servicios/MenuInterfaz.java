package servicios;

import java.io.IOException;

public interface MenuInterfaz {

	public int mostrarMenuYSeleccion();
	
	public void accederMenuGerencia() throws IOException;
	
	public void accederMenuEmpleado() throws IOException;
	
}
