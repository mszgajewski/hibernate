import entity.Ludzie;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

           TypedQuery<Ludzie> ludzieByNazwiskoQuery = entityManager.createNamedQuery("Ludzie.byNazwisko", Ludzie.class);
           ludzieByNazwiskoQuery.setParameter(1, "Gajewski");
           for (Ludzie ludzie : ludzieByNazwiskoQuery.getResultList()) {
               System.out.println(ludzie);
           }

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
