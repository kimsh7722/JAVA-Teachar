package Ch32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C02DBInsert {

	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "SYSTEM";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //연결URL(DBMS마다 상이함)
		
		//연결하기
		try 
		(
				Connection conn = DriverManager.getConnection(url,id,pw);		
				PreparedStatement pstmt=conn.prepareStatement("insert into a_tbl values(atbl_seq.NEXTVAL,?,?)");			
		)
		{
			pstmt.setString(1, "홍길동"); //이름
			pstmt.setString(2, "대구대구"); //주소

			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("INSERT 성공");
			}else {
				System.out.println("INSERT 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
