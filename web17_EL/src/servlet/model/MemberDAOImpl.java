package servlet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MemberDAOImpl implements MemberDAO {
	private static MemberDAOImpl dao = new MemberDAOImpl();
//	
//	  //싱글톤... 
//	private MemberDAOImpl() { try {
//	  Class.forName(ServerInfo.DRIVER_NAME); System.out.println("드라이버 로딩 성공...");
//	  
//	  }catch(ClassNotFoundException e) { System.out.println("드라이버 로딩 실패..."); } }
//	  
//	  public static MemberDAOImpl getInstance() { return dao; }
	  
	 
	 // DataSource방식으로 연결!
	 
	private DataSource ds;

	private MemberDAOImpl() {

		try {
			// Resource Factory
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/mysql");
			System.out.println("DataSource Lookup Complete");

		} catch (NamingException e) {
			System.out.println("DatsSource Lookup Failed ");

		}

	}

	public static MemberDAOImpl getInstance() {
		return dao;
	}

	@Override
	public Connection getConnection() throws SQLException {
		System.out.println("디비연결 성공....");
		//	Connection conn = DriverManager.getConnection(ServerInfo.URL,"root","1234");
		 // 인자값은 미리 xml파일에 연결되어져있다. Connection 공장에서 하나씩 빌려온다 .
		return ds.getConnection();
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null) ps.close();
		if (conn != null) conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(ps, conn);
	}

	@Override
	public void registerMember(MemberVO vo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnection();
			String query = "INSERT INTO member VALUES(?,?,?,?)";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement 생성됨...registerMember");

				ps.setString(1, vo.getId());
				ps.setString(2, vo.getPassword());
				ps.setString(3, vo.getName());
				ps.setString(4, vo.getAddress());
			
			int row = ps.executeUpdate();
			if (row >= 1) System.out.println(row + " row INSERT OK!!");
			else System.out.println("RegisterMember Error (이미 아이디가 등록되어있습니다.)");
			
		} finally {
			closeAll(ps, conn);
		}
	}

	@Override
	public ArrayList<MemberVO> showAllMember() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member";
			ps = conn.prepareStatement(query);
			System.out.println(" Prepared Statement 생성 완료 (showAllMember) ");

			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new MemberVO(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("address")));
			}
		} finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public MemberVO findByIdMember(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			conn = getConnection();
			String query = "SELECT id, password , name, address FROM member WHERE id=?";
			ps = conn.prepareStatement(query);
			System.out.println(" Prepared Statement 생성 (findByIdMember)");

			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				vo = new MemberVO(id, rs.getString("password"), rs.getString("name"), rs.getString("address"));
			}

		} finally {
			closeAll(rs, ps, conn);
		}
		return vo;
	}

	@Override
	public MemberVO login(String id, String password) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;

		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member WHERE id =? AND password =? ";
			ps = conn.prepareStatement(query);

			ps.setString(1, id);
			ps.setString(2, password);

			rs = ps.executeQuery();

			if (rs.next()) {

				vo = new MemberVO(id, password, rs.getString("name"), rs.getString("address"));

			}

		} finally {
			closeAll(rs, ps, conn); // Pool 에서 꺼낸 Connection 이 다시 Pool로 반환된다.
		}

		return vo;
	}

	// Business Logic 확인 해주기 위해 --> 여기서 확인절차
//	public static void main(String[] args) throws SQLException {
//		MemberDAOImpl dao = MemberDAOImpl.getInstance();
//		MemberVO VO = dao.findByIdMember("encore");
//		System.out.println(VO);
//		
//		ArrayList<MemberVO> list = dao.showAllMember();
//		System.out.println(list+"\n");
//
//		MemberVO vo = dao.login("encore", "playdata");
//		System.out.println(vo);

//	}
}
