package com.cg.question2;

public class Answer {
  int answerId;
  String answers;
  
public Answer() {
	super();
}

public Answer(int answerId, String answers) {
	super();
	this.answerId = answerId;
	this.answers = answers;
}

public int getAnswerId() {
	return answerId;
}

public void setAnswerId(int answerId) {
	this.answerId = answerId;
}


public String getAnswers() {
	return answers;
}


public void setAnswers(String answers) {
	this.answers = answers;
}

@Override
public String toString() {
	return "Answer [answerId=" + answerId + ", answers=" + answers + "]";
}


   
}
