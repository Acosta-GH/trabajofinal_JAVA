package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesController")
public class CookiesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CookiesController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		var cooks = request.getCookies();

		Integer visitas = 0;
		for (Cookie cookie : cooks) {
			if (cookie.getName().equals("VISITAS")) {
				visitas = Integer.parseInt(cookie.getValue());
			}
		}
		visitas++;
		response.getWriter().append("Visitas: ").append(visitas.toString());

		Cookie cook = new Cookie("VISITAS", visitas.toString());

		response.addCookie(cook);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
