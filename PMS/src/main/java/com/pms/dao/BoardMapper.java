package com.pms.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap; 
import org.apache.ibatis.annotations.Select;

import com.pms.domain.BoardVO;

public interface BoardMapper {
	@Select("SELECT NAME,AGE,SEX,LOCAL,DEPTNO,TITLE,CONTENT FROM BOARD;")
	@ResultMap("boardResultMap")
	public List<BoardVO> getBoard();
}
