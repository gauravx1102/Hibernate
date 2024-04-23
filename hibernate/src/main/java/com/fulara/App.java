package com.fulara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        //creating Student

        Student st = new Student();
        st.setId(101);
        st.setCity("Dwarahat");
        st.setName("Gaurav");
        st.setEmail("fularagaurav1102@gmail.com");
        System.out.println(st);


        //
        Address add = new Address();
        add.setStreet("Chakhutiya");
        add.setCity("Almora");
        add.setOpen(true);
        add.setAddedDate(new Date());
        add.setX(123.123);

        //Reading Image

        FileInputStream fis = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        add.setImage(data);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(st);
        session.save(add);

        session.getTransaction().commit();

        session.close();
    }
}
