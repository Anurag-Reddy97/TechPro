package com.nttdata;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         Scanner sc = new Scanner(System.in);
         System.out.println("1.Display details \t\t 2.Delete record");
         System.out.println("Enter the option");
         int ch = sc.nextInt();
         switch(ch)
         {
         case 1:
         Query query= session.createQuery("from Category");    
         List list = query.list();
         Iterator itr = list.iterator();
         while(itr.hasNext())
         {
        	 Object obj = itr.next();
        	 Category c = (Category) obj;
        	 System.out.println(c);
         }
         break;
         case 2:
        	 System.out.print("Enter category id to delete");
        	 Long id=sc.nextLong();
        	 Object o=session.load(Category.class,new Long(id));
        	 Category cat = (Category) o;
        	 session.delete(cat);
        	 System.out.println("Category deleted");
        	 break;
         }
         tx.commit();
	}
}

