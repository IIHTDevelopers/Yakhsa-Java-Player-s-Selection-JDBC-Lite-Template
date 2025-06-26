package com.playersselectionapplication.model;

public class Score {
	private int id;

	private int score;

	private int playerId;

	public Score() {
	}

	public Score(int id, int score, int playerId) {
		this.id = id;
		this.score = score;
		this.playerId = playerId;
	}

	public Score(int playerId, int score) {
		this.playerId = playerId;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return "Score{" + "id=" + id + ", score=" + score + ", playerId=" + playerId + '}';
	}
}
