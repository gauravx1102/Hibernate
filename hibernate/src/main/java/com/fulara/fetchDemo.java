package com.fulara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {
    public static void main(String[] args) {
        //get and load method
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student student = (Student)session.load(Student.class, 101);
        System.out.println(student);

//        Address ad = (Address)session.get(Address.class,1);
//        System.out.println(ad);
//        System.out.println(ad.getCity()+" "+ad.getStreet());

        session.close();
        factory.close();
    }
}
