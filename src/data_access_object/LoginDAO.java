package data_access_object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.JDBCUtil;
import util.DBConnection;

public class LoginDAO {

    public boolean authenticateUser(String username, String password) {
        String sql = "SELECT * FROM staff_account WHERE username = ? AND password = ?";

        try (Connection connection = JDBCUtil.getConnection();
        	 PreparedStatement statement = connection.prepareStatement(sql)) {
        	
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
