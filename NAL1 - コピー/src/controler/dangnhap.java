package controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.dangnhapdao;

public class dangnhap {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhập tài khoản");
	
		String nhap=scanner.nextLine();
		System.out.println("nhập mật khẩu");
		
		String mk=scanner.nextLine();
		dangnhapdao dao=new dangnhapdao();
		List<bean.dangnhap>list= dao.laythongtin();
		int kt=0;
		for(int i=0;i<list.size();i++) {
			if((list.get(i).getUser().equals(nhap)) && (list.get(i).getPass().equals(mk))) {
				kt=1;
			};
			
		}
		if(kt==0){
			System.out.println("đăng nhập thất bại");
		}else if(kt==1){
			System.out.println("đăng nhập thành công");
		}
		
		
	}

}
