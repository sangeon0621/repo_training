package com.example.demo.infra.codegroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "/infra/codegroup/codeGroupXdmList";
	}
	
}
