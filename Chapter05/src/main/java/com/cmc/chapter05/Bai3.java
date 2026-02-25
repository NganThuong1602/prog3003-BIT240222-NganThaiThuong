package com.cmc.chapter05;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bai3 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            Product product = new Product("Laptop", 1500);

            session.beginTransaction();

            session.persist(product);

            session.getTransaction().commit();

            System.out.println("Luu thanh cong!");

        } finally {
            factory.close();
        }
    }
}