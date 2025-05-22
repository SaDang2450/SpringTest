package com.sadang.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadang.spring.test.mybatis.domain.Estate;

@Mapper
public interface EstateRepository {

	public Estate selectEstateId(@Param("id") int id);

	public List<Estate> selectEstateRent(@Param("rent") int rent);

	public List<Estate> selectEstateAreaPrice(@Param("area") int area, @Param("price") int price);

	public int insertEstateByObject(Estate estate);

	public int insertEstate(@Param("realtorId") int realtorId, @Param("address") String address,
			@Param("area") int area, @Param("type") String type, @Param("price") int price,
			@Param("rentPrice") int rentPrice);
	
	public int updateEstate(@Param("id") int id, @Param("type") String type, @Param("price") int price);
	
	public int deleteEstate(@Param("id") int id);
}
