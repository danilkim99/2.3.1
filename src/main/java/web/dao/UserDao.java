package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void remove(int id);

    void edit(User user, int id);

    List<User> listUsers();

    User getById(int id);
}
