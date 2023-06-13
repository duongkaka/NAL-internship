package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoi {
	public static Connection cnn;

	public void KetNoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://LAPTOP-O557VD0N\\SQLEXPRESS:1433;databaseName=dangnhap;user=sa; password=sa123";
		cnn = DriverManager.getConnection(url);
		System.out.println("Kết nối thành công");
	}

	public static void main(String[] args) {
		try {

			ketnoi sc = new ketnoi();
			sc.KetNoi();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
