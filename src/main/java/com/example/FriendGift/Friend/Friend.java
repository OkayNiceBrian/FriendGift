package com.example.FriendGift.Friend;

import java.time.LocalDate;
import java.util.*;

public class Friend {

	private long id;
	private String firstName;
	private String lastName;
	private String birthday;
	
	public Friend(long id, String firstName, String lastName, String birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + birthday;
	}
}
