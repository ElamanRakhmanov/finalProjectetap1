package Company;

import Company.model.Gender;

import Company.model.User;

import Company.service.UserService;

import Company.service.impl.UserServiceImpl;

/**
 * Elaman Rakhmanov
 */

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, 22, "Bekzhan", Gender.MALE);
        User user2 = new User(2, 23, "Erbol", Gender.MALE);
        User user3 = new User(3, 20, "Nursuluu", Gender.FEMALE);

            UserService userService = new UserServiceImpl();
            userService.addUser(user1);
            userService.addUser(user2);
            userService.addUser(user3);
            userService.getById(1);
            System.out.println(userService.getAll());
            userService.removeById(2);
            System.out.println(userService.getAll());

    }
}