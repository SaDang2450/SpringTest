package com.sadang.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.sadang.spring.test.mvc.domain.Seller;

@Mapper
public interface SellerRepository {

	public int insertSeller(Seller seller);
}
