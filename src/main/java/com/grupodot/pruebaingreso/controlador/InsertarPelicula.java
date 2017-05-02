package com.grupodot.pruebaingreso.controlador;

import com.grupodot.pruebaingreso.dao.PeliculaDAO;
import com.grupodot.pruebaingreso.dao.PeliculaDAOImpl;
import com.grupodot.pruebaingreso.modelo.Pelicula;

public class InsertarPelicula {
	
	private static final long serialVersionUID = 1L;
	
	private Pelicula pelicula;
	
	public String execute() throws Exception {
		PeliculaDAO persis = new PeliculaDAOImpl();
		
		persis.addPelicula(pelicula);
		
		return "success";
	}
	
	public Pelicula getPelicula(){
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula){
		this.pelicula = pelicula;
	}

}
