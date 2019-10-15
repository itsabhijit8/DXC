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
 * Servlet implementation class questionController
 */
public class Q2retrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String ques;
	String qid;
       
    
    public Q2retrieveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		questionDAO dao = new questionDAOimpl();
		Question question2 = new Question();
		
		question2 = dao.getQuestion();
		
		 HttpSession session = request.getSession();
		 session.setAttribute("question2", question2.getQuestion());
		 session.setAttribute("qid2", question2.getQid());
		 
		String answer1 = request.getParameter("answer1");
		session.setAttribute("answer1", answer1);
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("second.jsp");
			dispatcher.forward(request, response);
	}

}
