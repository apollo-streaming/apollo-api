package repository;

import org.hibernate.Session;
import utils.Hibernate;

public class Podcast {
    public model.Podcast createPodcast(String title, String description, String banner){
        Session session = Hibernate.getSessionFactory().openSession();
        session.beginTransaction();

        model.Podcast podcast = new model.Podcast(title, description, banner);
        session.save(podcast);

        session.getTransaction().commit();
        Hibernate.shutdown();
        return podcast;
    }

}
