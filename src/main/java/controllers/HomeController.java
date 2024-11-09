package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utiles.ContadorVisitas;


@WebServlet("/home/*")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeController() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();		
		
	

		String kill = Optional
				.ofNullable(request.getParameter("kill"))
				.orElse("N");
		
		if(kill.equals("S")) {
			session.invalidate();

			PrintWriter wr = response.getWriter();
			wr.append("Session anulada");
			return;
		}
		
		//Obtener el nombre dentro de la session
		//Se asigna en el otro controllador
		Object oNom = session.getAttribute("nombre-usr");
		
		String nom = (String) oNom;
		
		
		//Obtener el contador de visitas
		Object oContador =  session.getAttribute("cont");
		ContadorVisitas cont ;
		if(oContador == null ) {
			cont = new ContadorVisitas();
			session.setAttribute("cont", cont);
		}else {
			cont = (ContadorVisitas) oContador ;
		}
		
		cont.incrementar();
		
		//Obtener la ID de session (La da Java)

		
		String id = session.getId();
		int segundos = session.getMaxInactiveInterval();
		
		
		PrintWriter wr = response.getWriter();

		wr.append("Tu nombre: " + nom);
		wr.append(" // Tu Id de sesion: "+id);
		wr.append(" // Visitas: "+cont.getVisitas());
		wr.append(" // Segundos hasta dar de baja: "
				+segundos);
		
	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
