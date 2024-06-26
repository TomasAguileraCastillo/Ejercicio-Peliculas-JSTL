package cl.praxis.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.Film;

/**
 * Servlet implementation class FilmServlet
 */
@WebServlet("/films")
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FilmServlet() {
        super();
     }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.getWriter().append("Served at: ").append(request.getContextPath());
 		
 		List<Film> films = new ArrayList<Film>();
 		
 		films.add(new Film(1,"Gladiador","pelicula de epoca", 1999));
 		films.add(new Film(2,"Star Wars","cienciaficcion", 1978));
 		films.add(new Film(3,"The hobbit","aventuras", 2005 ));
 		films.add(new Film(4,"Le llamaban Trinidad","Western", 1976));
 		films.add(new Film(5,"der Utergang","historica", 2010));
 		
 		request.setAttribute("films", films);
 		getServletContext().getRequestDispatcher("/films.jsp").forward(request, response);
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
