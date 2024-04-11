package com.fulara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        //creating student

        student st = new student();
        st.setId(100);
        st.setCity("Chakhutiya");
        st.setName("Gaurav");
        System.out.println(st);

        Session session = factory.openSession();

        session.beginTransaction();

        session.save(st);

        session.getTransaction().commit();

        session.close();
    }
}
