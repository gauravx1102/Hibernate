package com.fulara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Gaurav Fulara");
        s1.setCity("Dwarahat");

        Certificate c1 = new Certificate();
        c1.setCourse("Web Development");
        c1.setDuration("2 months");
        c1.setTaughtBy("Gaurav Fulara");
        s1.setCerti(c1);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Aayush");
        s2.setCity("Chakhutiya");

        Certificate c2 = new Certificate();
        c2.setTaughtBy("Modi");
        c2.setCourse("Ab ki baar kitni seat");
        c2.setDuration("4 june tk ka course hai fir ppo mil jaiega");
        s2.setCerti(c2);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        //object save

        s.save(s1);
        s.save(s2);
        tx.commit();
        s.close();

        factory.close();
    }
}
