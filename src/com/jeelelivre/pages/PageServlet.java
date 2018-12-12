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
		if(request.getParameter("id") == null) {
			request.setAttribute("page", this.pageManager.getPage());
			request.setAttribute("pageById", this.pageManager.getPageById(0));
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/page.jsp").forward(request,response);
				}
		request.setAttribute("pageByID", this.pageManager.getPageById(Integer.parseInt(request.getParameter("id"))));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/page.jsp").forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
