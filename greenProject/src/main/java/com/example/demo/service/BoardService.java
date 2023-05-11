package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.model.BoardRepositor;

import interfaces.boardInterface;

public class BoardService {
	
	@Autowired
	private boardInterface boardInterface;
	
	@Transactional
	public List<BoardRepositor> boardList(){
		List<BoardRepositor> list = boardInterface.findByBoardList();
		
		return list;
	}

}
