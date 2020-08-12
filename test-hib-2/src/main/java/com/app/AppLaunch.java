package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppLaunch {
	public static void main(String[] args) {
	
/*		User user1 = new User();
		user1.setEmail("balait14@gmail.com");
		user1.setMobile("7200627523");
		user1.setName("balamurugan");
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session1 = factory.openSession();
		session1.beginTransaction();
		session1.save(user1);
		session1.getTransaction().commit();
		session1.close();
		
		factory.close();
		
		System.out.println("Factory isClosed "+factory.isClosed());

		User user2 = new User();
		user2.setEmail("ramya.mathu23@gmail.com");
		user2.setMobile("8754215468");
		user2.setName("ramya");
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		session2.save(user2);
		session2.getTransaction().commit();
		session2.close();
		
		System.out.println("Factory isClosed "+factory.isClosed());
		factory.close();
		
		*/

		Employee e = new Employee();
		e.setDept("IS-IT");
		e.setType("Tech");
		e.setEmail("balamurugan.d@ticketgoose.com");
		e.setMobile("7200627523");
		e.setName("balamurugan");
		
		Customer c = new Customer();
		c.setType("Registered");
		c.setEmail("ramya.mathu23@gmail.com");
		c.setMobile("8754215468");
		c.setName("ramya");
		
		Agent a = new Agent();
		a.setType("B2B");
		a.setEmail("sandyboy697@gmail.com");
		a.setMobile("7397168335");
		a.setName("santhosh kumar");
		a.setPrepaid(true);
		
		
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session1 = factory.openSession();
		session1.beginTransaction();
		
		session1.save(c);
		session1.save(e);
		session1.save(a);
		
		session1.getTransaction().commit();
		session1.close();
		
		factory.close();
		
		System.out.println("Factory isClosed "+factory.isClosed());
	}
}
