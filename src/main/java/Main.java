import controller.Episode;
import controller.Podcast;
import controller.User;
import utils.Hibernate;

public class Main {
    public static void main(String[] args) {
        Hibernate.getSessionFactory();
        Podcast.routes();
        Episode.routes();
        User.routes();
    }
}
