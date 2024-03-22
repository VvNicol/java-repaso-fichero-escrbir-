package controladores;

import java.io.FileWriter;
import java.io.IOException;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {
	
	public static String rutaArchivo = "archivo.txt";
	
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		// Nombre del archivo
		

		int opcionMenuPrincipal;
		boolean cerrarAplicacion = false;
		// Crear un objeto FileWriter

		System.out.println("Se ha escrito en el archivo exitosamente.");

		try {

			FileWriter sw = new FileWriter(rutaArchivo);

			sw.write("¡Hola, mundo!\n");
			sw.write("Soy un archivo txt, creado desde java.\n");
			do {

				opcionMenuPrincipal = mi.mostrarMenuYSeleccion();

				switch (opcionMenuPrincipal) {
				case 0:
					cerrarAplicacion = true;
				sw.write("Aplicacion cerrada\n");	
					break;
				case 1:
					mi.accederMenuGerencia();
					sw.write("Menu gerencia\n");
					break;
				case 2:
					mi.accederMenuEmpleado();
					sw.write("Menu empleado\n");
					break;
				default:
					break;
				}

			} while (!cerrarAplicacion);
			
			sw.close();
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
