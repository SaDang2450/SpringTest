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
}
