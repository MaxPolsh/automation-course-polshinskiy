package org.example.infrastructure.data;

import java.util.ArrayList;
import java.util.List;

public class AbstractUserDataMapper {

    protected List<User> users = new ArrayList<>(15);

    public User findUserByEmail(String email) {
        for (User u: users) {
            if (u != null && u.getEmail().equals(email)) {
                return u;
            }
        }
        throw  new UserNotFoundException("User with email [" + email + "] was not found");
    }

    public User findUserByUsername(String username) {
        for (User u: users){
            if (u != null && u.getUsername().equals(username)){
                return u;
            }
        }
        throw  new UserNotFoundException("User with username [" + username + "] was not found");
    }

    public List<User> getAll() {
        return users;
    }

}
