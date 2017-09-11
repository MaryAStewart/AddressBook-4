 package addressbook.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addressbook.DB.UserDB;
import addressbookbusiness.User;

/**
 * Servlet implementation class AddressBookServlet
 */
@WebServlet({"/AddressBookServlet", "/list"})
public class AddressBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressBookServlet() {
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
		//doGet(request, response);
		 // get current action
        String action = request.getParameter("action");
        String url = "/index.html";
        if (action==null) {
        	action = "display_users";
			
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of everything in address book
            ArrayList<User> users = UserDB.fList();            
            request.setAttribute("users", users);
            url= "/list.jsp";
        } 
        getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);
	}

}
