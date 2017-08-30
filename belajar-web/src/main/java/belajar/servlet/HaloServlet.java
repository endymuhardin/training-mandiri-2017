package belajar.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/coba")
public class HaloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		Date sekarang = new Date();
		
		String output = "<html>\n";
		output += "<head><title>Halo Servlet</title></head>\n";
		output += "<body>"
				+ "<h1>Halo Servlet</h1>"
				+ "<h2>Waktu saat ini : "+sekarang+"</h2>"
				+ "</body>\n";
		output += "</html>\n";
		
		res.setContentType("text/html");
		res.getWriter().print(output);
		res.getWriter().flush();
	}
}
