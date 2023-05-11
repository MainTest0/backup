package com.example.demo.repository.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardRepositor {

	private int id;
	private String title;
	private String userId;
	private String content;
	private int viewCount;
	private Timestamp regTime;
	
}
