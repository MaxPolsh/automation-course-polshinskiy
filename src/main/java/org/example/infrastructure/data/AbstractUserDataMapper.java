package org.example.infrastructure.data;

public class AbstractUserDataMapper {

    protected User[] users = new User[15];

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

    public User[] getAll() {
        return users;
    }

}
