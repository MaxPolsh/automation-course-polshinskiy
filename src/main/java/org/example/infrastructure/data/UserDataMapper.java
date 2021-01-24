package org.example.infrastructure.data;

public interface UserDataMapper {

    User findUserByEmail(String email);

    User findUserByUsername(String username);

    User[] getAll();
}
