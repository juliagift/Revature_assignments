package com.app.model;

import java.util.Date;

public class Player {

	private int player_id;
	private String name;
	private int age;
	private String gender;
	private String contact;
	private Date dob;
	private String teamname;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int player_id, String name, int age, String gender, String contact, Date dob, String teamname) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.dob = dob;
		this.teamname = teamname;
	}

	public Player(int i, String string) {
		//TODO Auto-generated constructor stub
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", contact=" + contact + ", dob=" + dob + ", teamname=" + teamname + "]";
	}
	
	
	
}
