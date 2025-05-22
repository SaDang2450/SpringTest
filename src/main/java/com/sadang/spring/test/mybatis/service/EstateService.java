package com.sadang.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadang.spring.test.mybatis.domain.Estate;
import com.sadang.spring.test.mybatis.repository.EstateRepository;

@Service
public class EstateService {

	@Autowired
	private EstateRepository estateRepository;

	public Estate getEstateId(int id) {
		Estate resultEstate = estateRepository.selectEstateId(id);

		return resultEstate;
	}
	
	public List<Estate> getEstateRent(int rent) {
		List<Estate> resultEstate = estateRepository.selectEstateRent(rent);
		
		return resultEstate;
	}
	
	public List<Estate> getEstateAreaPrice(int area, int price) {
		List<Estate> resultEstate = estateRepository.selectEstateAreaPrice(area, price);
		
		return resultEstate;
	}
	
	public int addEstateByObject(Estate estate) {
		int resultAdd = estateRepository.insertEstateByObject(estate);
		
		return resultAdd;
	}
	
	public int addEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
		int resultAdd = estateRepository.insertEstate(realtorId, address, area, type, price, rentPrice);
		
		return resultAdd;
	}
	
	public int updateEstate(int id, String type, int price) {
		int resultUpdate = estateRepository.updateEstate(id, type, price);
		
		return resultUpdate;
	}
	
	public int deleteEstate(int id) {
		int resultDelete = estateRepository.deleteEstate(id);
		
		return resultDelete;
	}
}
