package Fri0113Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con1=null;
		
		Class.forName
		("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@70.12.114.104:"
						+ "1521:xe", "HR","HR");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = // 변경시
				" update movinf_table1 "
				+" set MovieName = ? " 
				+" where MovieName = ? ";
				
		
	
				PreparedStatement pst1 =
						con1.prepareStatement(sql2);
				
				Scanner sc1=new Scanner(System.in);
				
				System.out.println("변경 할 영화제목: ");
				String hal_name=sc1.next();
				
				System.out.println("변경 될 영화제목: ");
				String deul_name=sc1.next();
				
				
				
				pst1.setString(1, deul_name);
				pst1.setString(2, hal_name);
				
		
				int rowcnt1 = pst1.executeUpdate();
				System.out.println(rowcnt1+"행 update");
				con1.close();
				System.out.println("접속끝");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
