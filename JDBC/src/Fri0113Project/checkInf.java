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
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //손님용 조회
				" select MovieNumber 영화순번, MovieName 영화제목, "
				+ " MoviePrice 가격, MovieDate 년도"
				+ " from movinf_table1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			String numb=rs.getString("영화순번");
			String movtit=rs.getString("영화제목");
			String price=rs.getString("가격");
			String reldate=rs.getString("년도");
			System.out.println
			(rs.getRow()+"\t"+numb+"\t"+movtit+"\t"+price
					+"\t"+reldate);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
