package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.dangnhap;

public class dangnhapdao {
	public ArrayList<dangnhap> laythongtin() throws Exception{
		ketnoi sKetnoi=new ketnoi();
		sKetnoi.KetNoi();
		String sql="select *from DangNhap";
		PreparedStatement preparedStatement=sKetnoi.cnn.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<dangnhap>list=new ArrayList<>();
		while(resultSet.next()) {
			int id=resultSet.getInt("id_user");
			String user=resultSet.getString("username");
			String pass=resultSet.getString("pass");
			list.add(new dangnhap(id, user, pass));
		}
		return list;
		
	}

}
