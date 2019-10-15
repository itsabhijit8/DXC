package com.dxc.assessment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.assessment.DAO.questionDAO;
import com.dxc.assessment.DAO.questionDAOimpl;
import com.dxc.assessment.dbcon.DBConnection;

/**
 * Servlet implementation class result
 */
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		questionDAO dao = new questionDAOimpl();
		DBConnection connection = new DBConnection();
		int marks=0;
		
		String ans1 = (String) session.getAttribute("answer1");
		String ans2 = (String) session.getAttribute("answer2");
		String ans3 = request.getParameter("answer3");
		int qid1 =  (int) session.getAttribute("qid1");
		int qid2 =  (int) session.getAttribute("qid2");
		int qid3 =  (int) session.getAttribute("qid3");
		
		marks = dao.checkResult(qid1,marks,ans1);
		marks = dao.checkResult(qid2,marks,ans2);
		marks = dao.checkResult(qid3,marks,ans3);
		
		response.getWriter().println("Your Score is: "+marks);
		
		
		
		
//		response.getWriter().println("\n Answers you entered are:");
//		response.getWriter().println(ans1+"\n"+ ans2+ "\n"+ ans3);
	}

}
