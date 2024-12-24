package database;

import java.sql.Connection;
import java.sql.SQLException;

import util.DBConnection;
public class Test {
	public static void main(String[] args) {
		Connection connection = DBConnection.getConnection();
		
		if(connection != null) {
			System.out.println("Kết nối thành công!");
			DBConnection.closeConnection(connection);
		} else {
			System.out.println("Kết nối thất bại!");
		}
	}
}
