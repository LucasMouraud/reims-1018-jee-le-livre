

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
		// TODO Auto-generated method stub
		URL url = new URL("https://my-json-server.typicode.com/WildCodeSchool/reims-1018-jee-le-livre/pages");
		HttpURLConnection connection = null;
		int status = 0;
		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			status = connection.getResponseCode();
		}
		catch(ProtocolException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		if(status == 200) {
			BufferedReader in = new BufferedReader(
				new InputStreamReader(
					connection.getInputStream()
				)
			);
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			in.close();
			connection.disconnect();
			
	        //parser le fichier json
	        JSONParser parser = new JSONParser();
	        Object jsonParsed = null;
	        try{
	            jsonParsed = parser.parse(content.toString());
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        if(jsonParsed != null) {
			response.getWriter().append(content);
	        }
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
