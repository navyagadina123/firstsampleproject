package com.cg.question2;

import java.util.Iterator;
import java.util.List;

public class QuestionList {
	int questionId;
	String question;
	List<String> answers;
	
	public QuestionList() {
		super();
	}
	public QuestionList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public int getQustionId() {
		return questionId;
	}
	public void setQustionId(int qustionId) {
		this.questionId = qustionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void displayInfo(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  

}
}
