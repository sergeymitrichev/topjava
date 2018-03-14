package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class UsersUtil {
    public static final List<User> USERS = Arrays.asList(
            new User(1, "Vasya", "vasya@mail.com", "1234", Role.ROLE_USER),
            new User(1, "Nastya", "nastya@mail.com", "01234", Role.ROLE_USER),
            new User(2, "Igor", "igor@mail.com", "12345", Role.ROLE_USER, Role.ROLE_ADMIN)
    );
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map )
    {
        Map<K, V> result = new ConcurrentHashMap<>();
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();

        st.sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e ->result.put(e.getKey(),e.getValue()));

        return result;
    }
}
