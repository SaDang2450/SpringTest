package com.sadang.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("lifecycle/test01")
public class Practice01Controller {
	
	@ResponseBody
	@RequestMapping("/1")
	public String project01() {
		return ""
				+ "<html>\n"
				+ "	<head>\n"
				+ "		<title>practice01</title>\n"
				+ "	</head>\n"
				+ "	<body>\n"
				+ "		<h1>테스트 프로젝트 완성</h1>\n"
				+ "		<h3>해당 프로젝트를 통해서 문제풀이를 진행 합니다.</h3>\n"
				+ "	</body>\n"
				+ "</html>";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> score() {
		Map<String, Integer> score = new HashMap<String, Integer>();
		
		score.put("국어", 80);
		score.put("수학", 90);
		score.put("영어", 85);
		
		return score;
	}
}
