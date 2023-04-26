package createOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		//step 1
		Configuration configuration = new Configuration();
		//configuration is a class
		//step 2
		configuration.configure("hibernate.cfg.xml");
	
		//step 3
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		//sessionFactory is an interface
		
		//step 4
		Session session = sessionfactory.openSession();
		
		//session is an interface
		
		Transaction transaction = session.beginTransaction();
		//For calling session we are use Transaction interface 
		
		//Transaction is an interface
		
		//inster data into database
		
		//create object of POJO class
		
		Student student = new Student();
		student.setName("Vinayak");
		student.setCity("Ratnagiri");
		student.setMobile("9011133456");
		
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("Record upload successfully");

	}

}
