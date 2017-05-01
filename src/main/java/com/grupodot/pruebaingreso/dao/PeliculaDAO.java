package com.grupodot.pruebaingreso.dao;

import java.util.List;

import com.grupodot.pruebaingreso.modelo.Pelicula;


public interface PeliculaDAO {

	public Integer addPelicula(Pelicula pelicula);
	public void updatePelicula(Pelicula pelicula);
	public void removePelicula();
	public List<Pelicula> listaPeliculas();
	public Pelicula getPeliculaById();
	
}
