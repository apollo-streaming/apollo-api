import model.Category;
import repository.User;
import utils.Hibernate;

public class Main {
    public static void main(String[] args) {
        Hibernate.getSessionFactory();
        Category category = new Category();
        
                post("/users", (request, response) -> {
            
        });
        
        get("/users", (request, response) -> {
            
        });
        
        get("/users/:id", (request, response) -> {
            
        });
        
        put("/users/:id", (request, response) -> {
            
        });
        
        delete("/users/:id", (request, response) -> {
            
        });
        
        options("/users/:id", (request, response) -> {
            
        });
    }
}
