package com.infinite.springAop.AOPExample;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class CommonClass {

//	public  display(){
		private static DataSource datasource = null;
		public  DataSource display() {
			if (datasource == null) {
				HikariConfig config = new HikariConfig();
				config.setDriverClassName("com.mysql.cj.jdbc.Driver");
				config.setJdbcUrl("jdbc:mysql://localhost:3306/training");
				config.setUsername("root");
				config.setPassword("narennaren");
				config.setMaximumPoolSize(10);
				config.setAutoCommit(false);
				config.addDataSourceProperty("cachePrepStmts", "true");
				config.addDataSourceProperty("prepStmtCacheSize", "250");
				config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
				datasource = new HikariDataSource(config);
			}
			return datasource;
		}
	}

