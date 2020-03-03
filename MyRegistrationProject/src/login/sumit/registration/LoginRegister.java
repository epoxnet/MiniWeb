package login.sumit.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginRegister() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO cd = new CustomerDAOImpl();
		String userName = request.getParameter("username");//getting "username" from register
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");
		Customer c= cd.getCustomer(userName, password);
		
		
		if (submitType.equals("login") && c!=null && c.getName()!=null){//value= login -if data is not in DB
			request.setAttribute("message", "Welcome " + c.getName() + "!!!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else if(submitType.equals("register")){//value = register
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertCustomer(c);
			request.setAttribute("successMessage", "Registration done, please login to continue!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "Data Not Found! Click on Registration!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
