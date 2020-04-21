package com.nttdata;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	 //Configuration configuration = new Configuration().configure();
        // ServiceRegistryBuilder registry = new ServiceRegistryBuilder().registry.applySettings(configuration.getProperties());
         //ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
         
         //SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
         //Session session = sessionFactory.openSession();
         //session.beginTransaction();
         Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         Category category = new Category("Computer");
         
         Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
          
         Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
          
         Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
          
         Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
          
         Set<Product> products = new HashSet<Product>();
         products.add(pc);
         products.add(laptop);
         products.add(phone);
         products.add(tablet);
          
         category.setProducts(products);
          
         session.save(category);
          
         tx.commit();
         session.close();     
         
         
         
    }
}
