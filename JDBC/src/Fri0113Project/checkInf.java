package Fri0113Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class checkInf {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@70.12.114.104:"
						+ "1521:xe", "HR","HR");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�մԿ� ��ȸ
				" select MovieNumber ��ȭ����, MovieName ��ȭ����, "
				+ " MoviePrice ����, MovieDate �⵵"
				+ " from movinf_table1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			String numb=rs.getString("��ȭ����");
			String movtit=rs.getString("��ȭ����");
			String price=rs.getString("����");
			String reldate=rs.getString("�⵵");
			System.out.println
			(rs.getRow()+"\t"+numb+"\t"+movtit+"\t"+price
					+"\t"+reldate);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
