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
public class Q1retrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String ques;
	String qid;
       
    
    public Q1retrieveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		questionDAO dao = new questionDAOimpl();
		Question question1 = new Question();
		
		question1 = dao.getQuestion();
		
		 HttpSession session = request.getSession();
		 session.setAttribute("question1", question1.getQuestion());
		 session.setAttribute("qid1", question1.getQid());
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("first.jsp");
			dispatcher.forward(request, response);
	}

}
