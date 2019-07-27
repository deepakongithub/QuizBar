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


@Entity(name="QuestionsSet")
@Table(name="t_questions_set")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class QuestionsSet {

	@Column(name="set_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int set_id;

	@Column(name="set_level")
	private String set_level;
		
	@ManyToOne
	@JoinColumn(name="category_id")
	private Categories category_id;
	
	
	public int getSetId() {
		return set_id;
	}

	public void setSetId(int set_id) {
		this.set_id = set_id;
	}
	
	public void setSetLevel(String set_level) {
		this.set_level = set_level;
	}

	public String getSetLevel() {
		return set_level;
	}

	public void setCategoryId(Categories category_id) {
		this.category_id = category_id;
	}
	
	public Categories getCategoryId() {
		return category_id;
	}

	
}
*/