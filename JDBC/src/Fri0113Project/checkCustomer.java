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
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //관리자용조회
				" select CustNo 고객순번, CustName 고객이름,"
				+ " MovieNo 영화순번, CustTel  고객전화번호"
				+ " from cusinf_table2";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int cusnumb=rs.getInt("고객순번");
			String cusname=rs.getString("고객이름");
			int movnum=rs.getInt("영화순번");
			int custelep=rs.getInt("고객전화번호");
			System.out.println
			(rs.getRow()+"\t"+cusnumb+"\t"+cusname+"\t"+movnum
					+"\t"+custelep);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
		
		
		
		
		
		
	}

}
