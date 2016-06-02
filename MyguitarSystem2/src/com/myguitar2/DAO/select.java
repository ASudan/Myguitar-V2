package com.myguitar2.DAO;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public select() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html,charset=UTF-8");
		guitardao dao = new guitarimpel();
		request.setAttribute("list", dao.search());
		System.out.println(dao.search().get(1).getSerialNumber());
		System.out.println(dao.search().get(1).getBuilder());
		request.getRequestDispatcher("/Search.jsp").forward(request, response);
	}

}
