package Company.service.impl;

import Company.dao.UserDao;
import Company.model.User;
import Company.service.UserService;
import exception.MyException;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public List<User> getAll() {
        return userDao.getUsers();
    }

    @Override
    public void getById(int id) {

        try{
            User user1 = userDao.getUsers()
                    .stream()
                    .filter(user -> user.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new MyException("Not found user by this id " + id));
            System.out.println(user1);
        } catch(MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void removeById(int id) {

         try{User user1 = userDao.getUsers()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new MyException("Not found user by  this id " + id));
         userDao.getUsers().remove(user1);

         }catch(MyException e){
             System.out.println(e.getMessage());
         }
    }

    @Override
    public void addUser(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);

    }
}
