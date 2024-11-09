package controllers;

import models.Carrito;
import models.Producto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Carrito;


@WebServlet("/carrito")
public class CarritoController extends HttpServlet {
    private Carrito carrito = new Carrito();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("carrito", carrito);
        request.getRequestDispatcher("productos.jsp").forward(request, response);
    }
}

