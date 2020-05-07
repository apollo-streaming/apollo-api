package repository;

import org.hibernate.Session;
import utils.Hibernate;
public class Artist {
    public model.Artist createArtist(String bio){
        Session session = Hibernate.getSessionFactory().openSession();
        session.beginTransaction();

        model.Artist artist = new model.Artist(bio);
        session.save(artist);

        session.getTransaction().commit();
        Hibernate.shutdown();
        return artist;
    }
}
