package com.grupodot.pruebaingreso.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.grupodot.pruebaingreso.modelo.Pelicula;

public class PeliculaDAOImpl implements PeliculaDAO{

	private SessionFactory sessionFactory;
	
	public PeliculaDAOImpl() {
		sessionFactory = new Configuration().
				configure().
				addAnnotatedClass(Pelicula.class).
				buildSessionFactory();
	}
	
	@Override
	public Integer addPelicula(Pelicula pelicula) {
		
		Integer peliculaId = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			peliculaId = (Integer) session.save(pelicula);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return peliculaId;
	}

	@Override
	public void updatePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePelicula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pelicula> listaPeliculas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula getPeliculaById() {
		// TODO Auto-generated method stub
		return null;
	}

}
