package com.example.demo.infra.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import jakarta.servlet.http.HttpSession;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(value="/testLogin")
	public String testLogin() {
		return "/infra/test/testLogin";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/signinTestProc")
	public Map<String, Object> signinTestProc(TestDto testDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();

		TestDto rtMember = testService.selectOneLogin(testDto);

			if (rtMember != null) {
				

				returnMap.put("rt", "success");
			} else {
				returnMap.put("rt", "fail");
			}

		return returnMap;
	}
}
