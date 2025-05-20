package com.sadang.spring.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sadang.spring.test.database.domain.StoreRow;

@Mapper
public interface DatabasePractice01Repository {

	public List<StoreRow> selectStore();
}
