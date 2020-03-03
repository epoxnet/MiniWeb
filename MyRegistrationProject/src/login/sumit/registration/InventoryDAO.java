package login.sumit.registration;

public interface InventoryDAO {
	public int insertInventory(Inventory i);
	public Inventory getInventory(String manufacture, String model, String imei);
	//public Inventory getInventory(String manufacture, String imei);
}


