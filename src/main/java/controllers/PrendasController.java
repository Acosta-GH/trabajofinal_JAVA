package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Prenda;
import repos.PrendasRepo;

@WebServlet("/prendas")
public class PrendasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PrendasRepo prendasRepo;
	int visitas = 0;

	public PrendasController() {
		this.prendasRepo = PrendasRepo.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.visitas++;

		String accion = request.getParameter("accion");
		accion = Optional.ofNullable(accion).orElse("index");

		switch (accion) {
		case "visitas" -> getVisitas(request, response);
		case "index"-> getIndex(request,response);
		case "todas"-> getTodas(request,response);
		
		default -> response.sendError(404, "No existe la accion: " + accion);
		}

	}

	private void getTodas(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter escritor = response.getWriter();
		
		prendasRepo.getAll().stream()
			.map(Prenda::toString)
			.map( s -> s + "<br/>\n" )
			.forEach(escritor::append);
		
		
		
	}

	private void getIndex(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("prendas_index.jsp");
	}

	private void getVisitas(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.getWriter().append("" + this.visitas);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String accion = request.getParameter("accion");
		accion = Optional.ofNullable(accion).orElse("-");
		
		switch (accion) {
		case "alta" ->	postAlta(request,response);
		default -> response.sendError(404, "No existe la accion: " + accion);
		}
		

	}

	private void postAlta(HttpServletRequest request, HttpServletResponse response) {
		
		String codigo = request.getParameter("codigo");
		
		String sMetros = request.getParameter("metros");
		double metros = Double.parseDouble(sMetros);
		
		Prenda nPrenda = new Prenda();
		nPrenda.setCodigo(codigo);
		nPrenda.setMetrosTela(metros);
		
		prendasRepo.add(nPrenda);
		
		
	}

}
