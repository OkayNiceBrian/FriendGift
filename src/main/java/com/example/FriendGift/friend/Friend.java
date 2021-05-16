package com.example.FriendGift.friend;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Friend{

	@SequenceGenerator(
			name  = "friend_sequence",
			sequenceName = "friend_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "friend_sequence"
	)
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthday;
	@Transient
	private int age;
	//private List<Gift> gifts;
	
	public Friend() {
	}
	
	public Friend(long id, String firstName, String lastName, String email, LocalDate birthday) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthday = birthday;
	}
	
	public Friend(String firstName, String lastName, String email, LocalDate birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public int getAge() {
		return Period.between(this.birthday, LocalDate.now()).getYears();
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + birthday;
	}
}
