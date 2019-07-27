/*package com.breakthrough.workinfo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="questions")
@Table(name="t_questions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Questions {

	@Id
	@Column(name="question_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int question_id;

	@Column(name="question_text")
	private String question_text;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Categories category_id;
		
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "answer_id")
	private Answers answer_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "set_id")
	private QuestionsSet set_id;
	
	public int getQuestionId() {
		return question_id;
	}

	public void setQuestionId(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestionText() {
		return question_text;
	}

	public void setQuestionText(String question_text) {
		this.question_text = question_text;
	}

	public Categories getCategoryId() {
		return category_id;
	}

	public void setCategoryId(Categories category_id) {
		this.category_id = category_id;
	}
	
	public Answers getAnswerId() {
		return answer_id;
	}

	public void setAnswerId(Answers answer_id) {
		this.answer_id = answer_id;
	}
	
	public QuestionsSet getSetId() {
		return set_id;
	}

	public void setSetId(QuestionsSet set_id) {
		this.set_id = set_id;
	}

}
*/