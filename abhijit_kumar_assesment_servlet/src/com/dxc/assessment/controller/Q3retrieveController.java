package com.dxc.assessment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.assessment.DAO.questionDAO;
import com.dxc.assessment.DAO.questionDAOimpl;
import com.dxc.assessment.model.Question;

/**
 * Servlet implementation class Q3retrieveController
 */
public class Q3retrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String ques;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q3retrieveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		questionDAO dao = new questionDAOimpl();
		Question question3 = new Question();
		
		question3 = dao.getQuestion();
		
		 HttpSession session = request.getSession();
		 session.setAttribute("question3", question3.getQuestion());
		 session.setAttribute("qid3", question3.getQid());
		 
		 String answer2 = request.getParameter("answer2");
			session.setAttribute("answer2", answer2);
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("third.jsp");
			dispatcher.forward(request, response);
	}

}
