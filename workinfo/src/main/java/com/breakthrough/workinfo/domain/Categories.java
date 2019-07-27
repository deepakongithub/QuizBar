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

@Entity(name = "categories")
@Table(name = "t_categories")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Categories {

	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_id;

	@ManyToOne
	@JoinColumn(name = "topic_id")
	private Topics topic_id;

	@Column(name = "category_name")
	private String category_name;

	public int getCategoryId() {
		return category_id;
	}

	public void setCategoryId(int category_id) {
		this.category_id = category_id;
	}

	public void setTopicId(Topics topic_id) {
		this.topic_id = topic_id;
	}

	public Topics getTopicId() {
		return topic_id;
	}

	public void setCategoryName(String category_name) {
		this.category_name = category_name;
	}

	public String getCategoryName() {
		return category_name;
	}

}
*/