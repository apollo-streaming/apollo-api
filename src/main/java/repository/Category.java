package repository;

import org.hibernate.Session;
import utils.Hibernate;

public class Category {
    public model.Category createCategory(String category){
        Session session = Hibernate.getSessionFactory().openSession();
        session.beginTransaction();

        model.Category category1 = new model.Category(category);
        session.save(category1);

        session.getTransaction().commit();
        Hibernate.shutdown();
        return category1;
    }
}
