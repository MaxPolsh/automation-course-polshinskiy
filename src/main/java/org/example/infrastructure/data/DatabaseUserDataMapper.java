package org.example.infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DatabaseUserDataMapper extends AbstractUserDataMapper {


    public DatabaseUserDataMapper() {

        try {
            Connection connection = DriverManager.getConnection("test.sqlite");
            PreparedStatement st = connection.prepareStatement("SELECT * FROM users");

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                for (int i = 0; i < users.size(); i++) {
                    if (users == null) {
                        User u = new User(
                                resultSet.getString("id"),
                                resultSet.getString("email"),
                                resultSet.getString("username"),
                                resultSet.getString("password")
                        );
                        users.add(i,u);
                        break;
                    }
                }
            }
            } catch (Exception ex) {
                ex.printStackTrace();
        }
    }

}
