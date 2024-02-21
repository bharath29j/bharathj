package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FbLogin
 */
@WebServlet("/FbLogin")
public class FbLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FbLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);                            
		String us = request.getParameter("user");
		String pas = request.getParameter("pass");
		
		if (us.equals("bj29112002@gmail.com")&&pas.equals("bh29")) {
			List<Greens1> b=new ArrayList<Greens1>();
			Greens1 a1 = new Greens1();
			a1.setCourse("Java Fullstack");
			a1.setFees("40000");
			
			Greens1 a2 =new Greens1();
			a2.setCourse("pythonfull stack");
			a2.setFees("30000");
			
			Greens1 a3= new Greens1();
			a3.setCourse("java selinium");
			a3.setFees("25000");
			
			b.add(a1);
			b.add(a2);
			b.add(a3);
			request.setAttribute("userdef", b);
			request.getRequestDispatcher("Greens1.jsp").forward(request, response);
			
			
		} else {
              request.getRequestDispatcher("Greens2.jsp").forward(request, response);
		}
		
				
//		List<String>li =new ArrayList<String>();
//		li.add("RS.40000-JAVAFULLSTACK");
//		li.add("RS.35000-PYTHONFULLSTACK");
//		li.add("RS.50000-WEB DEVELOPER");
//		li.add("RS.30000-ANGULAR JS");
//		request.setAttribute("list", li);
//		request.getRequestDispatcher("Greens1.jsp").forward(request, response);
		
		
	}

}
