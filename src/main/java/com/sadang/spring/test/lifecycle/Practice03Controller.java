package com.sadang.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice03Controller {

	@RequestMapping("/lifecycle/test03/1")
	public String practice03() {
		return "lifecycle/practice03.html";
	}
}
