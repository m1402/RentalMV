package Fri0113Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		Connection con1=null;
		
		Class.forName
		("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@70.12.114.104:"
						+ "1521:xe", "HR","HR");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 =
				"insert into movinf_table1 values(?,?,?,?)";
		
		PreparedStatement pst1
		= con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("��ȭNo.: ");
		int numb=sc1.nextInt();	
		
		System.out.println("��ȭ����: ");
		String movtit=sc1.next();
		
		System.out.println("�뿩����: ");
		int price=sc1.nextInt();

		System.out.println("����: ");
		int reldate=sc1.nextInt();
		
		pst1.setInt(1, numb);
		pst1.setString(2, movtit);
		pst1.setInt(3, price);
		pst1.setInt(4, reldate);
		
		/*
		pst1.setInt(1, 1);
		pst1.setString(2, "�ƾ�");
		pst1.setInt(3, 100);
		pst1.setInt(4, 1960);
		*/
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� insert");
		con1.close();
		System.out.println("���ӳ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
