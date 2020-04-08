package com.url.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String pincode = request.getParameter("pincode");
			String[] technologies =	request.getParameterValues("technologies");
			response.setContentType("text/html");
			
			out.print("Pincode  - "+pincode+"</br>");
			out.print("</br>");
			int techlength = technologies.length;
			out.print("Technologies - ");
			int i=0;
			while(i!=techlength) {
				out.print( technologies[i] + " ");
				i++;
			}
			out.print("</br>");
			out.print("</br>");
	         
	        out.print("<a href='Servlet2?pincode="+pincode+"&technologies="+technologies+"'>Check jobs and city</a>");  
	                  
	        out.close();  
	  
	        }
		catch(Exception e)
		{
			System.out.println(e);
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
