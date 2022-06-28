package com.cg.question2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	int questionId;
	String question;
	Map<Integer,String> answers;
	public QuestionMap() {
		super();
	}
	public QuestionMap(int questionId, String question, Map<Integer, String> answers) {
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
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "QuestionMap [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
	public void displayInfo(){  
	    System.out.println("question id:"+questionId);  
	    System.out.println("question :"+question);  
	    System.out.println("Answers....");  
	    Set<Entry<Integer, String>> set=answers.entrySet();  
	    Iterator<Entry<Integer, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Integer,String> entry=itr.next(); 
	        System.out.println("AnswerId:"+entry.getKey()+" Answers:"+entry.getValue());
}
	}
}
