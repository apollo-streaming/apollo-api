package repository;
import model.UserViewModel;
import org.hibernate.Session;
import utils.Hibernate;

public class User {
    public model.User create(String name, String email, String password) {
        Session session = Hibernate.getSessionFactory().openSession();

        model.User user = new model.User(name, email, password);
        session.save(user);

        Hibernate.shutdown();
        return user;
    }

    public static model.User byId(Integer id){
        Session session = Hibernate.getSessionFactory().openSession();
        return session.get(model.User.class, id);
    }

    public static model.User byEmail(String Email){
        Session session = Hibernate.getSessionFactory().openSession();
        return session.get(model.User.class, Email);
    }

    public static model.User create(UserViewModel userInput) throws Exception {
        Session session = Hibernate.getSessionFactory().openSession();

        model.User user = new model.User();
        if (userInput.getId() != null ){
            user.setId(userInput.getId());
        }
        user.setName(userInput.getName());
        user.setEmail(userInput.getEmail());
        user.setPassword(userInput.getPassword());
        user.setProfilePicture(userInput.getProfilePicture());

        session.saveOrUpdate(user);

        return user;
    }

    public static void delete(Integer id) {
        Session session = Hibernate.getSessionFactory().openSession();
        session.delete(byId(id));
    }
}
