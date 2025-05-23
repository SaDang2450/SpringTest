package com.sadang.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sadang.spring.test.mvc.domain.Seller;
import com.sadang.spring.test.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/test/")
public class SellerController {

	@Autowired
	private SellerService sellerService;

	@RequestMapping("/insert")
	public String addSellerInput(Model model) {
		
		model.addAttribute("result", model);
		
		return "mvc/seller-input";
	}
	
	
	@PostMapping("/insert/result")
	public String addSeller(@RequestParam("nickname") String nickname, @RequestParam("url") String url, @RequestParam("temperature") double temperature) {
		
		Seller seller = new Seller();
		seller.setNickname(nickname);
		seller.setUrl(url);
		seller.setTemperature(temperature);
		int addResult = sellerService.addSeller(seller);
		
		return "mvc/seller-result"; 
	}
}
