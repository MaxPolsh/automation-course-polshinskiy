package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseUserDataMapper extends AbstractUserDataMapper {


    public DatabaseUserDataMapper() {

        try {
            Connection connection = DriverManager.getConnection("test.sqlite");
            PreparedStatement st = connection.prepareStatement("SELECT * FROM users");

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                users.add(new User(
                                resultSet.getString("id"),
                                resultSet.getString("email"),
                                resultSet.getString("username"),
                                resultSet.getString("password")));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
        }
    }
}
