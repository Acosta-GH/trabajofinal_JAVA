
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

import jakarta.servlet.http.HttpSession;
import models.Carrito;

@WebServlet("/agregarAlCarrito")
public class AgregarAlCarritoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productoIdStr = request.getParameter("id");
        int productoId = Integer.parseInt(productoIdStr); //agarra el id del parametro de la url

        Producto producto = buscarProductoPorId(productoId); //busca id con la funcion en este mismo archivo TODO: hay que cambiarlo/mejorarlo

        javax.servlet.http.HttpSession session = request.getSession();
        Carrito carrito = (Carrito) session.getAttribute("carrito"); 

        if (carrito == null) {
            carrito = new Carrito();
            session.setAttribute("carrito", carrito);
        }

        carrito.agregarProducto(producto);

        response.sendRedirect("carrito");
    }

    //Esto es temporal y pesimo, hay que cambiarlo para usar el json
    private Producto buscarProductoPorId(int productoId) {
        if (productoId == 1) {
            return new Producto(1, "Microsoft Windows 11 Pro", "Descripción del producto 1", 49.99, "https://images.g2a.com/940x528/1x1x0/microsoft-windows-11-pro-pc-microsoft-key-global-i10000271164001/f0fcf80e6cf84e518c39d5b6");
        } else if (productoId == 2) {
            return new Producto(2, "Microsoft Office Professional Plus 2021", "Descripción del producto 2", 19.99, "https://images.g2a.com/940x528/1x1x0/microsoft-office-professional-plus-2021-pc-microsoft-key-global-i10000271538001/202a62e65a5c456ebf44c92e");
        } else if (productoId == 3) {
            return new Producto(3, "Windows Server 2022 Standard", "Descripción del producto 3", 19.99, "https://images.g2a.com/940x528/1x1x0/windows-server-2022-standard-pc-microsoft-key-global-i10000266811003/2804575bd9dc42baa63e8e3c");
        }
        return null;
    }

}