package com.jeelelivre.pages;

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
@WebServlet("/pages")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PageManager pageManager;
	PageManager pagemanager = new PageManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
        super();
        this.pageManager = new PageManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Page page = null;
		if(request.getParameter("id") == null) {
			page = this.pageManager.getPageByIndex(0);
		}
		else {
			int id = Integer.parseInt(request.getParameter("id"));
			
			page = this.pageManager.getPageById(id);
		}
		
		request.setAttribute("page", page);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/page.jsp").forward(request,response);
	}
}
