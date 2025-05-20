package com.sadang.spring.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sadang.spring.test.database.domain.StoreRow;
import com.sadang.spring.test.database.service.DatabasePractice01Service;

@Controller
public class databasePractice01Controller {

	@Autowired
	private DatabasePractice01Service databasePractice01Service;

	@RequestMapping("db/test/practice01/1")
	@ResponseBody
	public List<StoreRow> practice01PresentationJSON() {

		List<StoreRow> resultList = databasePractice01Service.getStoreList();

		return resultList;
	}
}
