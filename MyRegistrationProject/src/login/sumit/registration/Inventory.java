package login.sumit.registration;

public class Inventory {
	private String manufacture;
	private String model;
	private String imei;
	
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "Inventory [manufacture=" + manufacture + ", model=" + model + ", imei=" + imei + "]";
	}

}
