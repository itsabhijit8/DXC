package com.dxc.assessment.DAO;

import com.dxc.assessment.model.Question;

public interface questionDAO {
		public Question getQuestion();
		public int checkResult(int qid, int marks, String ans);
		
}
