package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDB {

	public void userInfoInsert (String uName, String uAddress, String uAge) {
		
		Connection conn = null; 
		PreparedStatement pstmt = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/userDB?useSSL=false";
		String dbId = "root";
		String dbPw = "rootroot";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
			
			String sql = "insert into userTBL (uName, uAddress, uAge) values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uName);
			pstmt.setString(2, uAddress);
			pstmt.setString(3, uAge);
			pstmt.executeUpdate();
			System.out.println("userInfoInsert() 메서드 실행 완료!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
	
	
}
