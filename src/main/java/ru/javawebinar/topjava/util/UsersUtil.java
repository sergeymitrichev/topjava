package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UsersUtil {
    public static final List<User> USERS = Arrays.asList(
            new User(1, "Vasya", "vasya@mail.com", "1234", Role.ROLE_USER),
            new User(1, "Nastya", "nastya@mail.com", "01234", Role.ROLE_USER),
            new User(2, "Igor", "igor@mail.com", "12345", Role.ROLE_USER, Role.ROLE_ADMIN)
    );
}
