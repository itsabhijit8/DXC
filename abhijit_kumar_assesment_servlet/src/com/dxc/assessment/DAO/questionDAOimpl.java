package com.dxc.assessment.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dxc.assessment.dbcon.DBConnection;
import com.dxc.assessment.model.Question;


public class questionDAOimpl implements questionDAO {

	
	Connection connection = DBConnection.getConnection();
	String ques;
	String qid;
	public questionDAOimpl() {
		// TODO Auto-generated constructor stub
	}

	
	public Question getQuestion() {
		
		Question question = new Question();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery("select * from question order by rand() limit 1;");

			while (res.next()) {
				question.setQuestion(res.getString(2));
				question.setQid(res.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}

	
	public int checkResult(int qid, int marks, String ans) {
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement("select * from question where qid = ?");
				preparedStatement.setInt(1,qid);
				
				ResultSet res = preparedStatement.executeQuery();
				res.next();
				String correctAnswer = res.getString(3);
				
				if(ans.equals(correctAnswer))
				{
					System.out.println("Correct ans is :"+correctAnswer);
					System.out.println("Given ans is :"+ans);
					marks+=10;
				}
					

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return marks;
			
			

	}

}
