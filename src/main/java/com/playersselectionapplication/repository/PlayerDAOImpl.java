package com.playersselectionapplication.repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import com.playersselectionapplication.model.Player;

public class PlayerDAOImpl implements PlayerDAO {
	private final String url;
	private final String username;
	private final String password;

	public PlayerDAOImpl() {
		Properties properties = new Properties();
		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties")) {
			if (inputStream == null) {
				throw new RuntimeException("application.properties file not found");
			}
			properties.load(inputStream);
			url = properties.getProperty("db.url");
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");
		} catch (IOException e) {
			throw new RuntimeException("Failed to load application.properties file", e);
		}
	}

	@Override
	public void addPlayer(Player player) throws SQLException {
		// write your logic here
	}

	@Override
	public void updatePlayer(Player player) throws SQLException {
		// write your logic here
	}

	@Override
	public int deletePlayer(Player player) throws SQLException {
		// write your logic here
		return 0;
	}
}
