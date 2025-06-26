package com.playersselectionapplication.model;

public class Player {
	private int id;

	private String name;

	private String domesticTeam;

	private int average;

	public Player() {
	}

	public Player(int id, String name, String domesticTeam, int average) {
		this.id = id;
		this.name = name;
		this.domesticTeam = domesticTeam;
		this.average = average;
	}

	public Player(String name, String domesticTeam) {
		this.name = name;
		this.domesticTeam = domesticTeam;
		this.average = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomesticTeam() {
		return domesticTeam;
	}

	public void setDomesticTeam(String domesticTeam) {
		this.domesticTeam = domesticTeam;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Player{" + "id=" + id + ", name='" + name + '\'' + ", domesticTeam='" + domesticTeam + '\''
				+ ", average=" + average + '}';
	}
}
