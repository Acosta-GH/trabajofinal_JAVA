package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/telas/*")
public class TelasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TelasController() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = Optional
				.ofNullable(request.getPathInfo())
				.filter( p -> !p.equals("/") )
				.orElse("/index");
		
		switch (accion) {
		case "/index" -> getIndex(request,response);
		case "/info" -> getInfo(request,response);
		case "/*" -> response.sendRedirect( request.getContextPath() 
				+ request.getServletPath() + "/"  );
		
		
		
			default -> response.sendError(404, "No se encontró la ruta");
		}
		
	}


	


	private void getIndex(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		String ruta = request.getContextPath() + "/telas_index.html";
		response.sendRedirect(ruta);
		
	}


	private void getInfo(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {

		response.addHeader("Content-Type", "text/plain");
		PrintWriter wr = response.getWriter();

		wr.println("getContextPath: " + request.getContextPath());
		wr.println("getServletPath: " + request.getServletPath() );
		wr.println("getPathInfo: " + request.getPathInfo()  );
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
