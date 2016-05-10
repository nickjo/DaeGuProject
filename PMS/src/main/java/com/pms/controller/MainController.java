package com.pms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.pms.domain.BoardVO;
import com.pms.service.BoardService;

@Controller
public class MainController {
	@Autowired
	BoardService boardServiceImpl;
	private Logger log = Logger.getLogger(this.getClass());
	Gson gson = new Gson();
	
	@RequestMapping(value="getBoard.do")
	public @ResponseBody String getBoard(BoardVO boardVO, Model model){
		
		log.info("====== [Start getBoard()] =========");
		List<BoardVO> list = boardServiceImpl.getBoard();
		log.info("====== [End getBoard()] =========");
		return gson.toJson(list);
	}
			
}
