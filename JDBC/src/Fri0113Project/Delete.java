package Fri0113Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@70.12.114.104:"
						+ "1521:xe", "HR","HR");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�̸� ������
				"delete from movinf_table1 " 
						+" where MovieNumber = ?";
				
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("������ ��ȭ No.: ");
		int del_numb=sc1.nextInt();
		
	
		
		pst1.setInt(1, del_numb);

		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
