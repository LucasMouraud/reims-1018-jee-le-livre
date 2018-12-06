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
			text = "lorem ipsum";
			choices.add(1);
			choices.add(2);
		}
		else if (request.getParameter("choice").equals("1")){
			text = "toto";
			choices.add(2);
			choices.add(4);
			choices.add(5);
			choices.add(6);
		}
		else {
			text = "hello world";
			choices.add(1);
			choices.add(7);			
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
