package com.url.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
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
	          
	        //getting value from the query string  
	        String n1=request.getParameter("pincode");
	        String[] n2=request.getParameterValues("technologies");
	        
	        out.print("Hello "+n1 + n2);  
	        
	        Map<Integer, String> a= new HashMap<Integer,String>();
		    a.put(110096, "East Delhi");
		    a.put(110038, "Rajokri");
		    a.put(110001, "CP");
		    a.put(201306, "Greater Noida");
		    
		    if(a.containsKey(n1)) {
		    	out.print("City = "+a.get(n1));
		    	out.print(" Jobs = "+n2+" Developer.");
		    }
		    
		    out.close();  
		
	  
	        out.close();  
	  
	        }
		
		catch(Exception e){System.out.println(e);}  
	    }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
