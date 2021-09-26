package com.mobiletrain.web;


Public HelloServlet{
	public class LoginServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response){
			System.out.println("1234");
			System.out.println("1234");
			System.out.println("1234");
		}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
		}
	
	}

}