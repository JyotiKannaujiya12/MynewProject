package user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	String user_id=req.getParameter("user_id");
	String password=req.getParameter("user_pass");
	System.out.println("USer id:"+user_id);
	System.out.println("password:"+password);
}
}
