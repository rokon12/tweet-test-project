package com.codexplo.tweets.utils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DatabaseConnectionPool {
	private static final Logger log = LoggerFactory
			.getLogger(DatabaseConnectionPool.class);

	private static final String DRIVER_NAME;
	private static final String URL;
	private static final String USER_NAME;
	private static final String PASSWORD;

	private static DataSource dataSource;

	static {

		final ResourceBundle config = ResourceBundle.getBundle("db");

		DRIVER_NAME = config.getString("jdbc.driver");
		URL = config.getString("jdbc.url.address");
		USER_NAME = config.getString("db.user");
		PASSWORD = config.getString("db.password");

		try {
			dataSource = setupDataSource();

		} catch (PropertyVetoException e) {
			log.error("Unable to find property", e);
		}
	}

	public static Connection getConnection() throws SQLException {
		log.debug("getConnection()");
		return dataSource.getConnection();
	}

	private static DataSource setupDataSource() throws PropertyVetoException {
		log.debug("setupDataSource()");

		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

		comboPooledDataSource.setDriverClass(DRIVER_NAME);
		comboPooledDataSource.setJdbcUrl(URL);
		comboPooledDataSource.setUser(USER_NAME);
		comboPooledDataSource.setPassword(PASSWORD);

		comboPooledDataSource.setMinPoolSize(5);
		comboPooledDataSource.setAcquireIncrement(5);
		comboPooledDataSource.setMaxPoolSize(20);
		return comboPooledDataSource;
	}
}
