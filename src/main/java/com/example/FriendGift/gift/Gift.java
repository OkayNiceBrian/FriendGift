package com.example.FriendGift.gift;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Gift {

	@SequenceGenerator(
			name  = "gift_sequence",
			sequenceName = "gift_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "gift_sequence"
	)
	@Id
	private long id;
	private String name;
	private String url;
	private String description;
	
	public Gift() {
	}
	
	public Gift(long id, String name, String url, String description) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
	}
	
	public Gift(String name, String url, String description) {
		this.name = name;
		this.url = url;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
