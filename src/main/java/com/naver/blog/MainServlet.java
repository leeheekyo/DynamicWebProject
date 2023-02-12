package com.naver.blog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/get")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StringBuffer sb = new StringBuffer();
		javax.servlet.http.HttpSession session = request.getSession();
		
		session.setAttribute("key", request.getParameter("value"));
		
		sb.append("session id : " + session.getId() + "\n");
		
		response.getWriter().append(sb.toString());
	}

}
