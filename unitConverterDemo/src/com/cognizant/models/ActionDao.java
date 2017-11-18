package com.cognizant.models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActionDao {

	   public static int retriverowNumFromDB(String table){
		   
			  SessionFactory sessFact = new Configuration().
		              configure().
		              //addPackage("com.xyz") //add package if used.
		              addAnnotatedClass(User.class).
		              buildSessionFactory();
		 
			    
			   
				Session session = sessFact.getCurrentSession();
				org.hibernate.Transaction tr = session.beginTransaction();
		        List users = session.createQuery("FROM users").list(); 
				
		        

				tr.commit();
				System.out.println("Number of rows in User tables " + users.size());
				sessFact.close();
			   
			   return users.size();
				
			}
		   
		   public static List<User> retriverUsers(String table){
			   
				  SessionFactory sessFact = new Configuration().
			              configure().
			              //addPackage("com.xyz") //add package if used.
			              addAnnotatedClass(User.class).
			              buildSessionFactory();
			 
				    
				   
					Session session = sessFact.getCurrentSession();
					org.hibernate.Transaction tr = session.beginTransaction();
			        List users = session.createQuery("FROM users").list(); 
					
			        

					tr.commit();
					System.out.println("Number of rows in User tables " + users.size());
					sessFact.close();
				   
				   return users;
					
				}

		   
		   
		}