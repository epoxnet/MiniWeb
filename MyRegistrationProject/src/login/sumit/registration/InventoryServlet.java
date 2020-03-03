package login.sumit.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InventoryServlet")
public class InventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InventoryServlet() {
        super();
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InventoryDAO item = new InventoryDAOImpl();
		String manufacture = request.getParameter("manufacture");//getting "manufacture" from welcome.jsp
		String model = request.getParameter("model");
		String imei = request.getParameter("imei");
		String submitType = request.getParameter("submit");
		Inventory i= item.getInventory(manufacture, model, imei);
		//System.out.println("i= "+ i);
		if(submitType.equals("search") && i!=null && i.getImei()!=null){//search item in DB
			request.setAttribute("displaymsg","Manufacture: " + i.getManufacture());
			request.setAttribute("displaymsg1","Model: " + i.getModel());
			request.setAttribute("displaymsg2","IMEI: " + i.getImei());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);	
			
		}else if(submitType.equals("add")){//add item in DB
			i.setManufacture(request.getParameter("manufacture"));
			i.setModel(model);
			i.setImei(imei);
			item.insertInventory(i);
			request.setAttribute("successMessageItem", "Item has been added to DataBase Successfully!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);	
		
		}else{
			request.setAttribute("failureMessage", "Data Not Found! Click to add it to the inventory list!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		
		
	}

}
