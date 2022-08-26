package Company.service;

import Company.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void getById(int id);
    void removeById(int id);
    void addUser(User user);
}
