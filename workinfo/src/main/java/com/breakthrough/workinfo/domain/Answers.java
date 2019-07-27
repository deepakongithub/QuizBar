/*package com.breakthrough.workinfo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="answers")
@Table(name="t_answers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Answers {

	@Id
	@Column(name="answer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int answer_id;

	@Column(name="answer")
	private String answer;
		
	@ManyToOne
	@JoinColumn(name="question_id")
	private Questions question_id;
	
		
	public int getAnswerId() {
		return answer_id;
	}

	public void setAnswerId(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestionId() {
		return question_id;
	}

	public void setQuestionId(Questions question_id) {
		this.question_id = question_id;
	}
	
}
*/