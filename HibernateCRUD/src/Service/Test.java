package Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	public static void main(String[] args) {
		
         System.out.println("Connecting to Database");
         
         SessionFactory factory=new Configuration()
        		                   .configure("hibernate.cfg.xml")
        		                   .buildSessionFactory();
         Session session=factory.openSession();
         Teacher obj=new Teacher("lalla","Raut","Vard.raut22");
         session.beginTransaction();
         session.save(obj);
         
         
         session.getTransaction().commit();
         
         
         System.out.println("Created");
         session.close();
	}
}
