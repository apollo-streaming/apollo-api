package controller;

import com.google.gson.Gson;
import model.BaseResponse;
import model.EpisodeViewModel;
import model.UserViewModel;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class User {
    public static void routes() {
        Gson gson = new Gson();

        post("/createdUser", (req, res) -> {
            UserViewModel user = gson.fromJson(req.body(), UserViewModel.class);
            model.User createdUser;
            try {
                createdUser = repository.User.create(user);
            } catch (Exception ex) {
                System.out.println(ex);
                return new BaseResponse(false, null);
            }
            return new BaseResponse(true, new UserViewModel(createdUser));
        }, gson::toJson);

        delete("/user/:id", (req, res) -> {
            try {
                repository.User.delete(Integer.parseInt(req.params(":id")));
            } catch (Exception ex) {
                return new BaseResponse(false, null);
            }
            return new BaseResponse(true, null);
        }, gson::toJson);

        post("/userLogin", (req, res) -> {
            UserViewModel user = gson.fromJson(req.body(), UserViewModel.class);
            model.User createdUser;
            try {
                createdUser = repository.User.byEmail(user.getEmail());
            } catch (Exception ex) {
                System.out.println(ex);
                return new BaseResponse(false, null);
            }
            return new BaseResponse(true, new UserViewModel(createdUser));
        }, gson::toJson);
    }
}
