package com.example.demo.infra.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	TestDao testDao;
	
	public TestDto selectOneLogin(TestDto testDto) {
		return testDao.selectOneLogin(testDto);
	}
	
}
