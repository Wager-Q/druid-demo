package com.weimob.druid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SimpleService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String,Object>> getInfo(){
		String sql = "select * from book";
		return jdbcTemplate.queryForList(sql);
	}
}
