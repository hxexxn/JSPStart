package servletStart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userDB;

/**
 * Servlet implementation class ExServlet01
 */
@WebServlet("/abc")
public class ExServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String userName = request.getParameter("userName");
//		String address = request.getParameter("address");
//		String age = request.getParameter("age");
//		System.out.println(userName);
//		System.out.println(address);
//		System.out.println(age);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String userName = request.getParameter("userName");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		
		userDB db = new userDB();
		db.userInfoInsert(userName, address, age);
		
		
	}

}
