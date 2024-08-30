package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import beans.Emp;

public class EmpDao {

	private String jdbcURL = "jdbc:postgresql://localhost:5432/testdb?characterEncoding=UTF-8";

	// JDBCドライバーのロード
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// データベース接続を取得
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcURL);
	}

	// Create (INSERT)
	public void addEmployee(Emp emp) {
		System.out.println("Registering employee: " + emp.getName() + ", " + emp.getEmail());

		String sql = "INSERT INTO Employee (name, email) VALUES (?, ?)";

		try (Connection conn = getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, emp.getName());
			stmt.setString(2, emp.getEmail());
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Index (FIND)
	public List<Emp> findAll() {
		return null;
	}

}
