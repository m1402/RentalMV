package Fri0113Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class checkCustomer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@70.12.114.104:"
						+ "1521:xe", "HR","HR");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�����ڿ���ȸ
				" select CustNo ������, CustName ���̸�,"
				+ " MovieNo ��ȭ����, CustTel  ����ȭ��ȣ"
				+ " from cusinf_table2";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int cusnumb=rs.getInt("������");
			String cusname=rs.getString("���̸�");
			int movnum=rs.getInt("��ȭ����");
			int custelep=rs.getInt("����ȭ��ȣ");
			System.out.println
			(rs.getRow()+"\t"+cusnumb+"\t"+cusname+"\t"+movnum
					+"\t"+custelep);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
		
		
		
		
		
		
	}

}
