package com.sadang.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sadang.spring.test.mybatis.domain.Estate;
import com.sadang.spring.test.mybatis.service.EstateService;

@RestController
@RequestMapping("/mybatis/practice01/")
public class EstateController {

	@Autowired
	private EstateService estateService;

	@RequestMapping("/select/1")
	public Estate resultEstateId(@RequestParam("id") int id) {
		Estate resultEstate = estateService.getEstateId(id);

		return resultEstate;
	}

	@RequestMapping("/select/2")
	public List<Estate> resultEstateRent(@RequestParam("rent") int rent) {
		List<Estate> resultEstate = estateService.getEstateRent(rent);

		return resultEstate;
	}

	@RequestMapping("/select/3")
	public List<Estate> resultEstateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		List<Estate> resultEstate = estateService.getEstateAreaPrice(area, price);
		
		return resultEstate;
	}

}
