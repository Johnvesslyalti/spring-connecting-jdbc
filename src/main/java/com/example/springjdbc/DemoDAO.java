package com.example.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDAO {
	JdbcTemplate jdbcTemplate;

	public DemoDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertDemo(String name, String mobile) {
		String query = "INSERT INTO demotable(name,mobile)VALUES(?,?);";
		jdbcTemplate.update(query,name,mobile);
	}
}
