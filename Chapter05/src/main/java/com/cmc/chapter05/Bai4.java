package com.cmc.chapter05;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Bai4 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            session.beginTransaction();

            List<Product> products = session
                    .createQuery("FROM Product p WHERE p.price > 1000", Product.class)
                    .getResultList();

            System.out.println("Danh sach san pham gia > 1000:");

            for (Product p : products) {
                System.out.println(
                        p.getId() + " - " +
                        p.getName() + " - " +
                        p.getPrice()
                );
            }

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
