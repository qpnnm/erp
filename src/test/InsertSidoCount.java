package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.erp.test.common.Conn;

public class InsertSidoCount {
	Connection con = Conn.open();
	String sql = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	{

		try {
			sql = "insert sido";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
