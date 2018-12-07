import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page
 */
@WebServlet("/book")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = "";
		List<String> choices = new ArrayList<String>();
		if(request.getParameter("choice")==null) {
			text = "Ça y est !!! Enfin mon premier jour à Poudlard. J'en rêve depuis que j'ai reçu ma lettre d'admission, et je me retrouve enfin avec le choixpeau sur la tête.";
			choices.add("Courageux");
			choices.add("Loyal");
			choices.add("Sage");
			choices.add("Malin");
		}

		else if (request.getParameter("choice").equals("Courageux")){
			text = "Trop bien, Gryffondor c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add("Je suis le premier de la classe");
			choices.add("Je suis un cancre");
		}
		
		else if (request.getParameter("choice").equals("Loyal")){
			text = "Trop bien, Poufsouffle c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add("Je suis le premier de la classe");
			choices.add("Je suis un cancre");
		}
		else if (request.getParameter("choice").equals("Sage")){
			text = "Trop bien, Serdaigle c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add("Je suis le premier de la classe");
			choices.add("Je suis un cancre");
		}
		else if (request.getParameter("choice").equals("Malin")){
			text = "Trop bien, Serpentard c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add("Je suis le premier de la classe");
			choices.add("Je suis un cancre");
		}
		
		else if (request.getParameter("choice").equals("Je suis le premier de la classe")){
			text = "Je sors de l'école et je trouve tout de suite un poste au ministère de la magie :)";
			choices.add("Je redemarre l'histoire!");
		}
		
		else if (request.getParameter("choice").equals("Je suis un cancre")){
			text = "Pas grave : je termine l'école sans passer mon diplome, et j'ouvre une boutique de farces magiques :)";
			choices.add("Je redemarre l'histoire!");
		}
		
		else {
			text = "Ça y est !!! Enfin mon premier jour à Poudlard. J'en rêve depuis que j'ai reçu ma lettre d'admission, et je me retrouve enfin avec le choixpeau sur la tête.";
			choices.add("Courageux");
			choices.add("Loyal");
			choices.add("Sage");
			choices.add("Malin");
		}
		
		request.setAttribute("text", text);
		request.setAttribute("choices", choices);
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
