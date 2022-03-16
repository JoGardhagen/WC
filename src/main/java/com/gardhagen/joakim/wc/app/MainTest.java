package com.gardhagen.joakim.wc.app;

import javax.persistence.*;
import java.util.List;

public class MainTest {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
    EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
    EntityTransaction transaction = null;
    public MainTest() {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNativeQuery("SELECT courseName from courses");
            List<String> s = query.getResultList();

            for (String S : s) {
                System.out.println(S);
            }

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
        } finally {
            entityManager.close();
        }
    }

}
