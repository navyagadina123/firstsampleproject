package com.cg.question2;
import java.util.Iterator;
import java.util.Set;

public class Question1Set {
	int questionId;
	String question;
	Set<String> answers;
	
	public Question1Set() {
		super();
	}

	public Question1Set(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question1Set [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
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
