package login.sumit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class InventoryDAOImpl implements InventoryDAO {
	
	static Connection con;
	static PreparedStatement ps;
	
	
	public int insertInventory(Inventory i) {
		int status=0;
		try{
			con= MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into inventory values (?,?,?)");
			ps.setString(1, i.getManufacture());
			ps.setString(2, i.getModel());
			ps.setString(3, i.getImei());
			
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		return status;
	}
	
	
//	public Inventory editInventory(String manufacture, String imei) {
//	
//		Inventory i = new Inventory();
//		try{
//			con = MyConnectionProvider.getCon();
//			ps= con.prepareStatement("select * from inventory  where manufacture =? or imei=?");
//			ps.setString(1, manufacture);
//			ps.setString(3, imei);
//			
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()){
//				i.setManufacture(rs.getString(1));
//				i.setModel(rs.getString(2));
//				i.setImei(rs.getString(3));
//			}
//			
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		
//		
//		
//		return i;
//	}


	@Override
	public Inventory getInventory(String manufacture, String model, String imei) {
		Inventory i = new Inventory();
		try{
			con = MyConnectionProvider.getCon();
			ps= con.prepareStatement("select * from inventory  where manufacture =? or model =? or imei=?");
			ps.setString(1, manufacture);
			ps.setString(2, model);
			ps.setString(3, imei);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				i.setManufacture(rs.getString(1));
				i.setModel(rs.getString(2));
				i.setImei(rs.getString(3));
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		return i;
	}



}
