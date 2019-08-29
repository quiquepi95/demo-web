package es.indra.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletInicioSesion
 */
@WebServlet("/ServletInicioSesion")
public class ServletInicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInicioSesion() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		String nombreDeUsuario = request.getParameter("login");
		
		session.setAttribute("usuario", nombreDeUsuario);
		
		System.out.println("NOMBRE DE USUARIO: " + nombreDeUsuario);
		
		String idioma = request.getParameter("idioma");
		System.out.println("IDIOMA: " + idioma);
		
		if(idioma.equals("1")) {
			idioma="Español";
		} else {
			idioma="Inglés";
		}
		
		Cookie idi = new Cookie("cIdioma", idioma);
		response.addCookie(idi);
		
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
