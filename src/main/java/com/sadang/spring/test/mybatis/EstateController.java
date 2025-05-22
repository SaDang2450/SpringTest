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

	@RequestMapping("/insert/1")
	public String createEstateByObject() {
		Estate estate = new Estate();
		estate.setRealtorId(3);
		estate.setAddress("푸르지용 리버 303동 1104호");
		estate.setArea(89);
		estate.setType("매매");
		estate.setPrice(100000);

		int resultCreate = estateService.addEstateByObject(estate);

		return "입력 성공 : " + resultCreate;
	}

	@RequestMapping("/insert/2")
	public String createEstate(@RequestParam("realtorid") int realtorId) {
		String address = "썅떼빌리버 오피스텔 814호";
		int area = 45;
		String type = "월세";
		int price = 100000;
		int rentPrice = 120;

		int resultCreate = estateService.addEstate(realtorId, address, area, type, price, rentPrice);

		return "입력 성공 : " + resultCreate;
	}

	@RequestMapping("/update/1")
	public String modifyEstate() {
		int id = 22;
		String type = "전세";
		int price = 70000;

		int resultModify = estateService.updateEstate(id, type, price);

		return "수정 성공 : " + resultModify;
	}
	
	@RequestMapping("/delete/1")
	public String eraseEstate() {
		int id = 23;
		
		int resultErase = estateService.deleteEstate(id);
		
		return "삭제 결과 : " + resultErase;
	}
}
