package com.pms.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// SpringContext를 테스트용으로 구동하기 위해 환경을 잡아주겠다는 표시
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/*.xml"})
public class TestMainController {
	@SuppressWarnings("unused")
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private MainController mainController;
	
	@Test
	public void getBoardTest(){
		assertNotNull(mainController.getBoard());
	}
}
