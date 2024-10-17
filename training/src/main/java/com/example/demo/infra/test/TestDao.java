package com.example.demo.infra.test;

import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

	public TestDto selectOneLogin(TestDto testDto);
	
}
