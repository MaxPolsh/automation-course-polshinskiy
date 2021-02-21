package org.example;

import java.util.List;

public interface UserDataMapper {

    User findUserByEmail(String email);

    User findUserByUsername(String username);

    List <User> getAll();
}
