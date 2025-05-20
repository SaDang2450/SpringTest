package com.sadang.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadang.spring.test.database.domain.StoreRow;
import com.sadang.spring.test.database.repository.DatabasePractice01Repository;

@Service
public class DatabasePractice01Service {

	@Autowired
	private DatabasePractice01Repository databasePractice01Repository;

	public List<StoreRow> getStoreList() {

		List<StoreRow> resultList = databasePractice01Repository.selectStore();

		return resultList;
	}
}
