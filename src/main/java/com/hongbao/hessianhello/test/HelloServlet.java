/**
 * 
 */
package com.hongbao.hessianhello.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hzllb
 *
 * 2016年2月11日
 */
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3918317947293345737L;

	
	public void init() throws ServletException{
		super.init();
		System.out.println("hello servlet init");
	}
	
	
	public void destroy(){
		super.destroy();
		
		System.out.println("hello servlet destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException 
	    {
			String param1 = this.getServletConfig().getInitParameter("param");
			String param2 = this.getInitParameter("param");
			String param3 = (String) this.getServletContext().getInitParameter("contextparam");
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        try {
	            // Write some content
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>MyFirstServlet</title>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h2>Servlet MyFirstServlet at " + request.getContextPath() + "</h2>");
	            out.println("</body>");
	            out.println("</html>");
	        } finally {
	            out.close();
	        }
	    }
}
