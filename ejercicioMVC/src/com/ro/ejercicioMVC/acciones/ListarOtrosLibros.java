package com.ro.ejercicioMVC.acciones;

public class ListarOtrosLibros extends Accion {

	
	public void execute () {
		
		String informe = " No hay libros disponibles de ning�n tipo, todos est�n prestados";  
		request.setAttribute("LibrosEncontrados", informe);
		
		
	}
	
	
}
