package sample;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/name-wish")
public class WishName extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("a");
		res.getWriter().print("<h1 align = 'center' style = 'color : midnightblue'> Happy Birthday!! " + name + "</h1>");
	}
	

}
