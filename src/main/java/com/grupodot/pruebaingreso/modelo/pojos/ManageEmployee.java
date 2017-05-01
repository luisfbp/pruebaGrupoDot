package com.grupodot.pruebaingreso.modelo.pojos;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class ManageEmployee {
   private static SessionFactory factory;
   
   public static void main(String[] args) {
      try{
         factory = new Configuration().
                   configure().
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Pelicula.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageEmployee ME = new ManageEmployee();

      /* Add few employee records in database */
      Integer peliculaID = ME.addPelicula("Pelicula23", "Esta inserción viene de hibernate");
      
      System.out.println("Se inserto la pelicula " + peliculaID);
      /* List down all the employees */
//      ME.listEmployees();
//
//      /* Update employee's records */
//      ME.updateEmployee(peliculaID, 5000);
//
//      /* Delete an employee from the database */
//      ME.deleteEmployee(peliculaID);
//
//      /* List down new list of the employees */
//      ME.listEmployees();
   }
   
	public Integer addPelicula(String nombre, String descripcion) {
		Integer peliculaId = null;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Pelicula pelicula = new Pelicula();
			pelicula.setNombre(nombre);
			pelicula.setDescripcion(descripcion);
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
 
//   /* Method to CREATE an employee in the database */
//   public Integer addEmployee(String fname, String lname, int salary){
//      Session session = factory.openSession();
//      Transaction tx = null;
//      Integer employeeID = null;
//      try{
//         tx = session.beginTransaction();
//         Employee employee = new Employee();
//         employee.setFirstName(fname);
//         employee.setLastName(lname);
//         employee.setSalary(salary);
//         employeeID = (Integer) session.save(employee); 
//         tx.commit();
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//      return employeeID;
//   }
//   /* Method to  READ all the employees */
//   public void listEmployees( ){
//      Session session = factory.openSession();
//      Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         List employees = session.createQuery("FROM Employee").list(); 
//         for (Iterator iterator = 
//                           employees.iterator(); iterator.hasNext();){
//            Employee employee = (Employee) iterator.next(); 
//            System.out.print("First Name: " + employee.getFirstName()); 
//            System.out.print("  Last Name: " + employee.getLastName()); 
//            System.out.println("  Salary: " + employee.getSalary()); 
//         }
//         tx.commit();
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//   }
//   /* Method to UPDATE salary for an employee */
//   public void updateEmployee(Integer EmployeeID, int salary ){
//      Session session = factory.openSession();
//      Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         Employee employee = 
//                    (Employee)session.get(Employee.class, EmployeeID); 
//         employee.setSalary( salary );
//		 session.update(employee); 
//         tx.commit();
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//   }
//   /* Method to DELETE an employee from the records */
//   public void deleteEmployee(Integer EmployeeID){
//      Session session = factory.openSession();
//      Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         Employee employee = 
//                   (Employee)session.get(Employee.class, EmployeeID); 
//         session.delete(employee); 
//         tx.commit();
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//   }
}