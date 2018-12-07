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
		List<Integer> choices = new ArrayList<Integer>();
		if(request.getParameter("choice")==null) {
			text = "Ça y est !!! Enfin mon premier jour à Poudlard. J'en rêve depuis que j'ai reçu ma lettre d'admission, et je me retrouve enfin avec le choixpeau sur la tête.";
			choices.add(1);
			choices.add(2);
			choices.add(3);
			choices.add(4);
		}

		else if (request.getParameter("choice").equals("1")){
			text = "Trop bien, Gryffondor c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add(5);
			choices.add(6);
		}
		
		else if (request.getParameter("choice").equals("2")){
			text = "Trop bien, Poufsouffle c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add(5);
			choices.add(6);
		}
		else if (request.getParameter("choice").equals("3")){
			text = "Trop bien, Serdaigle c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add(5);
			choices.add(6);
		}
		else if (request.getParameter("choice").equals("4")){
			text = "Trop bien, Serpentard c'est la maison que je voulais rejoindre. Je démarre les cours.";
			choices.add(5);
			choices.add(6);
		}
		
		else if (request.getParameter("choice").equals("5")){
			text = "Je sors de l'école et je trouve tout de suite un poste au ministère de la magie :)";
			choices.add(7);
		}
		
		else if (request.getParameter("choice").equals("6")){
			text = "Pas grave : je termine l'école sans passer mon diplome, et j'ouvre une boutique de farces magiques :)";
			choices.add(7);
		}
		else {
			text = "Ça y est !!! Enfin mon premier jour à Poudlard. J'en rêve depuis que j'ai reçu ma lettre d'admission, et je me retrouve enfin avec le choixpeau sur la tête.";
			choices.add(1);
			choices.add(2);
			choices.add(3);
			choices.add(4);
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
