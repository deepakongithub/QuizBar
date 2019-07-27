/*package com.breakthrough.workinfo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="topics")
@Table(name="t_topics")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Topics {

	@Id
	@Column(name="topic_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int topic_id;

	@Column(name="topic_name")
	private String topic_name;
	
	public int getTopicId() {
		return topic_id;
	}

	public void setTopicId(int topic_id) {
		this.topic_id = topic_id;
	}
	
	public void setTopicName(String topic_name) {
		this.topic_name = topic_name;
	}

	public String getTopicName() {
		return topic_name;
	}

}
*/