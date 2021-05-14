package com.example.FriendGift.gift;

public class Gift {

	private long id;
	private String name;
	private String url;
	private String description;
	
	public Gift(long id, String name, String url, String description) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
	}
	
	public Gift(long id, String name) {
		this.id = id;
		this.name = name;
		this.url = "";
		this.description = "";
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
