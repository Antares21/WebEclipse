package com.raul.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.raul.database.InterfazDAO;
import com.raul.database.PersonalData;

public class DAO_ImplJDBC implements InterfazDAO{

	private static final String sqlSELECT = "SELECT * FROM git_personas p WHERE p.usuario=? AND p.clave=?;";
	
	
	public DAO_ImplJDBC(){
		
	}

	public Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/git_database", "root", "admin");
		} catch (Exception e) {
			System.out.println("Error Occured While Getting the Connection: - " + e);
		}
		return connection;
	}
	
	
	@Override
	public PersonalData getInfo(String user, String pwd) {
		// TODO Auto-generated method stub
		PersonalData data=null;
		
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con = getConnection();
			pst = con.prepareStatement(sqlSELECT);
			pst.setString(1, user);
			pst.setString(2, pwd);
			rs = pst.executeQuery();
			if(rs.next()){
				data = new PersonalData(rs.getInt("id"),
										rs.getString("usuario"),
										rs.getString("clave"),
										rs.getString("nombre"),
										rs.getInt("edad"),
										rs.getLong("telefono") );
			}
			
		}catch(SQLException sqlex){
			try {
                if(rs!=null){
            		rs.close();                 }
                if(pst!=null){
                	pst.close();                }
                if(con!=null){
                	con.close();                }
			} catch (SQLException e) {
				System.out.println("SQLException Finally: - " + e);
			}
		}
		
		
		return data;
	}
	
	
}
