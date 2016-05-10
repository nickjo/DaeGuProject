package com.pms.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pms.service.BoardService;

// SpringContext�� �׽�Ʈ������ �����ϱ� ���� ȯ���� ����ְڴٴ� ǥ��
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/*.xml"})
public class MainControllerTest {
	@SuppressWarnings("unused")
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private BoardService boardServiceImpl;
	
	@Test
	public void getBoardTest(){
		assertNotNull(boardServiceImpl.getBoard());
	}
}