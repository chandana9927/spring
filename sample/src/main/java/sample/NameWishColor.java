package sample;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/name-wish-color")
public class NameWishColor extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String color = req.getParameter("color");
		res.getWriter().print("<h1 align = 'center'" + "style = 'color:"+ color + "' > " + "Happy Birthday!!!" + name + "</h1>");
	}

}
