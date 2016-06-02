package com.myguitar2.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.myguitar2.conn.dbconn;
import com.myguitar2.model.guitar;
import com.myguitar2.model.guitarspec;



public class guitarimpel implements guitardao{
	
		@Override
		public List<guitar> search() {
			List<guitar> listguitar = new ArrayList<guitar>();
			String sql = "select * from guitar";
			Connection Conn = dbconn.open();
			try {
				PreparedStatement pstmt = Conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()){
					guitar guitar=new guitar();
					guitar.setSerialNumber(rs.getString(1));
					guitar.setPrice(rs.getString(2));
					guitar.setBuilder(rs.getString(3));
					guitar.setType(rs.getString(4));
					guitar.setBackWood(rs.getString(5));
					guitar.setTopWood(rs.getString(6));
					listguitar.add(guitar);
				}
				return listguitar;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				dbconn.close(Conn);
			}
		return null;
	}

}
