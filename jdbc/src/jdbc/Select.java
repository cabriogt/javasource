package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@192.168.219.105:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url,user,password);
			
			if (con!=null) {
				System.out.println("Not Connect");
				
				String sql = "SELECT * FROM emp";
				
				pstmt = con.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				
				System.out.println("empno ename job mgr hiredate sal comm deptno");
				
				while (rs.next()) {//tabla resultado 
					System.out.print(rs.getString("empno")+"\t");//number
					System.out.print(rs.getString("ename")+"\t");//varchar2
					System.out.print(rs.getString("job")+"\t");//name
					System.out.print(rs.getInt("mgr")+"\t");//number
					System.out.print(rs.getDate("hiredate")+"\t");//Date
					System.out.print(rs.getInt("sal")+"\t");//number
					System.out.print(rs.getInt("comm")+"\t");//number
					System.out.println(rs.getInt("deptno"));//number
				}
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
