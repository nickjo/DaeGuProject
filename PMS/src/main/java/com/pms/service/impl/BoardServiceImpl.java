package com.pms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.dao.BoardMapper;
import com.pms.domain.BoardVO;
import com.pms.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired(required=false)
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoard() {
		// TODO Auto-generated method stub
		return boardMapper.getBoard();
	}

}
